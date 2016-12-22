package com.threefishes.service;

import java.util.HashMap;
import java.util.Map;

import com.threefishes.base.Pingshuiyun;
import com.threefishes.utils.LoadProperties;

public class PingshuiyunService {
	private static LoadProperties lp = new LoadProperties();
	
	public Map<String,Pingshuiyun> loadPingshuiyun(){
		
		Map<String,Pingshuiyun> lpsy = new HashMap<String,Pingshuiyun>();
		Map<String,String> p = lp.loadPingshuiyunToMap();
		for(String key : p.keySet()){
			Pingshuiyun psy = new Pingshuiyun();
			String yun = p.get(key);
			if(yun.indexOf("平") > 0){
				psy.setPingze("平");
			}else{
				psy.setPingze("仄");
			}
			psy.setYun(yun);
			psy.setZi(key);
			
			lpsy.put(key,psy);
		}
		return lpsy;
		
	}
	
	public void searchByKey(String zi) {
		Map<String,Pingshuiyun> p = loadPingshuiyun();
		Pingshuiyun sp = p.get(zi);
		System.out.println(zi + "的搜索结果：" + sp);
	}
	
	
	public static void main(String args[]){
		PingshuiyunService ps = new PingshuiyunService();
		Map<String,Pingshuiyun> lpsy = ps.loadPingshuiyun();
		for( String psy : lpsy.keySet()){
			System.out.println(lpsy.get(psy));
		}
		
		ps.searchByKey("想");
		
		
	}
}
