package com.hashset;

public class Course {
	private int cId;
	private String cName;
	private int fees;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(int cId, String cName, int fees) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.fees = fees;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
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
		return "Course [cId=" + cId + ", cName=" + cName + ", fees=" + fees + "]";
	}
	

}
