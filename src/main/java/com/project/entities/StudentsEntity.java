package com.project.entities;

public class StudentsEntity {
	int sid;
	String sname;
	String mobno;
	public StudentsEntity(String sname, String mobno) {
		super();
		//this.sid = sid;
		this.sname = sname;
		this.mobno = mobno;
	}
	public StudentsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "StudentsEntity [sid=" + sid + ", sname=" + sname + ", mobno=" + mobno + "]";
	}
	
	
}
