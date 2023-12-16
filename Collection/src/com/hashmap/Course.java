package com.hashmap;

public class Course {
	private int cid;
	private String cName;
	private int fees;
	Course()
	{
		
	}
	public Course(int cid, String cName, int fees) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.fees = fees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cName=" + cName + ", fees=" + fees + "]";
	}
	
}
