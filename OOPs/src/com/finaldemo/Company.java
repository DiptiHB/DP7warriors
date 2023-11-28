package com.finaldemo;
class Developer
{
	final String cname;
	final float salary;
	final int noOfHrs;
	String ename;
	
	{
		cname="HCL";
		noOfHrs=8;
	}
	 Developer()
	 {
		salary=10000; 
	 }
	 Developer(String ename,float salary)
	 {
		 this.ename=ename;
		 this.salary=salary;
	 }
	
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public String getEname() 
	{
		return ename;
	}
	public float getSalary() 
	{
		return salary;
	}
	void skills()
	{
		System.out.println("HTML, C,C++,Java");
	}
}
class Fullstackdev
{
	void skills()
	{
		System.out.println("angular,react,springboot,mongoDB");
	}
	
}
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d=new Developer();
		System.out.println(d.cname+" "+d.ename+" "+d.salary);
		d.setEname("Dipti");
		System.out.println(d.cname+" "+d.ename+" "+d.salary);
		Developer d1=new Developer("Prisha",250000f);
		System.out.println(d1.cname+" "+d1.ename+" "+d1.salary);
		d.skills();
		
		d1.skills();
		
		Fullstackdev fd=new Fullstackdev();
		fd.skills();
		
	}

}
