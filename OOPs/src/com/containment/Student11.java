package com.containment;

public class Student11 {
	
	private int sId;
	private String name;
	private Course course;
	 Student11()
	{
		
		
	}
	 Student11(int sId,String name,Course course)
	{
	this.sId=sId;
	this.name=name;
	this.course=course;
		
	}
	public void setSId(int sId)
	{
		this.sId=sId;
	}
	public int getSId()
	{
		return sId;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCourse(Course course)
	{
		this.course=course;
	}
	
	public Course getCourse()
	{
	return course;
		
	}
	public String toString()
	{
		
		return "\n id: "+sId+"\n name: "+name+"\n course: "+course.toString();
	}
}
