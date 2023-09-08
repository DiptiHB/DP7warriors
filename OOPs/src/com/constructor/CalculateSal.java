package com.constructor;

class Employee
{
int id;
String name;
String designation;
double salary;

public Employee(int id,String name,String designation,double salary)
{
	this.id=id;
	this.name=name;
	this.designation=designation;
	this.salary=salary;	
}
public double getSalary()
{
	return salary;
	
}
public String toString()
{
	return id+" "+name+" "+designation+" "+salary;
}

}
public class CalculateSal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee(1,"dipti","HR",50000);
		System.out.println(e);
		
		double totalSal=e.getSalary();
		totalSal=totalSal+(totalSal*0.1);
		e.salary=totalSal;
		
		System.out.println("net salary="+e.salary);	
		
	}	

}
