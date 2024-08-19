package com.fileconnect;

public class employee {

	
	private int eid;
	private String ename;
	private int eage;
	private String edesg;
	private double esal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", edesg=" + edesg + ", esal=" + esal
				+ "]";
	}
	public employee(int eid, String ename, int eage, String edesg, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.edesg = edesg;
		this.esal = esal;
	}
	
	
}
