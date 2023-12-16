package com.comparatordemo;

public class StudentName {
	private String name;
	public StudentName() {
		// TODO Auto-generated constructor stub
	}
	public StudentName(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentName \nname: " + name ;
	}
	

}
