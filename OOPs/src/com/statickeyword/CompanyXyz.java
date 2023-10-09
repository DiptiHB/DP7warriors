package com.statickeyword;

 class employees {
	
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
employees()
{
	
}

employees(int id,String name,int salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}

static void changeName(String cName)
{
	System.out.println("after changing name: ");
	comName=cName;
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

//public void setComName(String comName)
//{
//	this.comName=comName;
//}
//public String getComName()
//{
//	return comName;
//}
public String toString()
{
	return id+" "+name+" "+salary+" "+comName;			
}

}

 public class CompanyXyz
 {
	 public static void main(String args[])
	 {
		System.out.println("company name= "+employees.comName); 
		 System.out.println("number of object ceated: "+employees.count);
		 employees e1=new employees(111,"dipti",50000);
		 employees e2=new employees(112,"priyanka",40000);
		 employees e3=new employees(113,"Prisha",80000);
		
		 System.out.println(e1);
		 System.out.println(e2);
		 System.out.println(e3);
		 
		 employees.changeName("sunbeam");
		 System.out.println(e1);
		 System.out.println(e2);
		 System.out.println(e3);
		 System.out.println("--------------after object creation-------------");
		 System.out.println("number of object created: "+employees.count);
		 
	 }
 }
 