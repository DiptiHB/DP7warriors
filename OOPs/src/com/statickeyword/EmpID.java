package com.statickeyword;
class AutoGen
{
int empId;
private String name;
private int salary;
static String comName;
static int empCount;
static
{
	comName="Sun";
	empCount=1;
}
{
	empId=empCount;
	empCount++;

}
AutoGen()
{
	

}
AutoGen(String name,int salary)
{
	this.name=name;
	this.salary=salary;
}
//void autoAssign()
//{
//	empId=empCount;
//	empCount++;
//	
//}

public void setEmpId(int empId) 
{
	this.empId=empId;
}
public int getEmpId()
{
	return empId;
}

public void setName(String name) 
{
	this.name = name;
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
public String toString()
{
	return "\n empId: "+empId+"\n name: "+name+"\n salary: "+salary;
}

}

public class EmpID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoGen a1=new AutoGen("dipti",50000);
		AutoGen a2=new AutoGen("harish",90000);
		AutoGen a3=new AutoGen("ujwala",100000);
		
//		a1.autoAssign();
//		a2.autoAssign();
//		a3.autoAssign();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		

	}

}
