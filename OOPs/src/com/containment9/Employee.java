package com.containment9;

public class Employee {
	private int empId;
	private String empName;
	private int salary;
	MyDate m;
	Depatment d;
	Employee()
	{
		
	}
	Employee(int empId,String empName,int salary,MyDate m,Depatment d)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.m=m;
		this.d=d;
		
	}
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setD(Depatment d)
	{
		this.d=d;
	}
	public Depatment getD()
	{
		return d;
	}
	public void setM(MyDate m)
	{
		this.m=m;
	}
	public MyDate getM()
	{
		return m;
	}
	public String toString()
	{
		return "\n employee id: "+empId+"\n employee name: "+empName+"\n salary"+salary+"\n department details: "+d+"\n date: "+d;
	}

}
