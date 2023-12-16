package com.serializable;

import java.io.Serializable;

public class StudentInfo implements Serializable{
	private String name;
	private int age;
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}
	public StudentInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", age=" + age + "]";
	}
	

}
