package com.threefishes.utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class LoadProperties {
    public Map<String,String> loadPingshuiyunToMap(){
    	Map<String,String>  pingshuiyun = new HashMap<String,String>();
    	
    	Properties prop = new Properties();
    	Reader reader = null;
    	
		try {
			reader = new BufferedReader(new FileReader(new File(this.getClass().getClassLoader().getResource(".").getPath() + "/pingshuiyun.properties")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
    	if(reader != null){
			try {
				prop.load(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	
        //prop.list(System.out);
        
        for( Object key : prop.keySet()){
        	
        	String value = prop.getProperty((String)key);
        	int i = 0;
        	int length = value.length();
        	for(;i < length; i++){
        		String yunkey = (String)key;
        		String pkey = value.substring(i, i+1);
        		if(i+2 < length){
	        		String nkey = value.substring(i+1, i+2);
	        		if(pingshuiyun.containsKey(pkey)) {
	        			String ekey = pingshuiyun.get(pkey);
	        			yunkey = yunkey + "-" + ekey;
	        		};
	        		if(nkey.equals("[")){
	        			//System.out.println(value.substring(i+1, length));
	        			//System.out.println(i+1);
	        			int nextp = value.substring(i+1, length).indexOf("]",0);
	        			//System.out.println(i + nextp);
	        			pkey = value.substring(i, i + nextp + 2);
	        			i = i + nextp + 1;
	        		}
        		}
        		pingshuiyun.put(pkey, yunkey);
        		//System.out.println(pkey + "-" + yunkey );
        	}
        }
    	return pingshuiyun;
    }
    
    public static void main(String[] args){
    	LoadProperties lp = new LoadProperties();
    	lp.loadPingshuiyunToMap();
    }
}
