package com.threefishes.base;

public class Pingshuiyun {

	private String zi;
	private String pingze;
	private String yun;
	
	public String getZi() {
		return zi;
	}
	public void setZi(String zi) {
		this.zi = zi;
	}
	public String getPingze() {
		return pingze;
	}
	public void setPingze(String pingze) {
		this.pingze = pingze;
	}
	public String getYun() {
		return yun;
	}
	public void setYun(String yun) {
		this.yun = yun;
	}
	@Override
	public String toString() {
		return "平水韵 [韵字=" + zi + ", 平仄=" + pingze + ", 韵部=" + yun + "]";
	}
	
	
	
	
}
