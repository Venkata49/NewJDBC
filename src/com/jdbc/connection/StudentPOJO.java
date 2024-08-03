package com.jdbc.connection;

public class StudentPOJO {
	
	private int sid;
	private String sname;
	private int sage;
	private String sgroup;
	private double smarks;
	
	public int getSid() {
		
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSgroup() {
		return sgroup;
	}
	public void setSgroup(String sgroup) {
		this.sgroup = sgroup;
	}
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "StudentPOJO [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", sgroup=" + sgroup + ", smarks="
				+ smarks + "]";
	}
	
	
	

}
