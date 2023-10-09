package com.statickeyword;
class EmpInfo
{
	private int id;
	private String name;
	private int salary;
	static String comName;
	static int count;
	static
	{
		comName="Infosys";
		count=0;
	}
	{
		count++;
	}
	EmpInfo()
	{
		
	}
	EmpInfo(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	static void totalCount()
	{
		System.out.println("total object created: "+count);
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId() 
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSalary(int salary) 
	{
		this.salary=salary;
	}
	public int getSalary() 
	{
		return salary;
	}
	
	public String toString() {
		return "EmpInfo :\n id: " + id + "\n name: " + name + "\n salary: " + salary+" \n company name: "+comName;
	}
	
	
}

public class EmployeeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EmpInfo e1=new EmpInfo(111,"dipti",50000);
		 EmpInfo e2=new EmpInfo(112,"priyanka",40000);
		 EmpInfo e3=new EmpInfo(113,"Prisha",80000);
		 System.out.println(e1);
		 System.out.println(e2);
		 System.out.println(e3);
		 
		 EmpInfo.totalCount();

	}

}
