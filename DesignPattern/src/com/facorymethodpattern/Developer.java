package com.facorymethodpattern;

public abstract class Developer {
	String name;
	float salary;
	int noOfHours;
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public Developer(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void salaryPaid();
	public abstract void skillSet();
	public void workinhHours()
	{
		noOfHours=8;
	}
}
