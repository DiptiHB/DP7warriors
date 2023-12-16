package com.containment5;

public class StudentDetail {
	int rollNo;
	String sname;
	Department dept;
	
	StudentDetail()
	{
		
	}
	StudentDetail(int rollNo,String sname,Department dept)
	{
		this.rollNo=rollNo;
		this.sname=sname;
		this.dept=dept;
		
	}
	
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	public int getRollNo() 
	{
		return rollNo;
	}
	
	public void setSname(String sname) 
	{
		this.sname = sname;
	}
	public String getSname()
	{
		return sname;
	}
	
	public void setDept(Department dept)
	{
		this.dept = dept;
	}
	public Department getDept()
	{
		return dept;
	}
	public String toString() 
	{
		return "Student Details : \n rollNo:" + rollNo + "\n student name:" + sname + " \n department:" + dept;
	}
	
	
}
