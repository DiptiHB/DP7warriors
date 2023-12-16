package com.hashset;

public class Student {
	private int id;
	private String name;
	private int marks;
	int feesPaid;
	Course course;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int marks,int feesPaid, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course=course;
		this.feesPaid = feesPaid;
	}
	public int getId() {
		return id;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", feesPaid=" + feesPaid + "Course: "+course+ "]";
	}
	

}
