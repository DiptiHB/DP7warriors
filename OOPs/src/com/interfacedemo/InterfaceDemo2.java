package com.interfacedemo;
interface TaxPay
{
	String cName="India";
	public void pay();
}
class Celebraty implements TaxPay
{
	String celebratyName;
	float income;
	Celebraty()
	{
		
	}
	
	public Celebraty(String celebratyName, float income)
	{
		this.celebratyName = celebratyName;
		this.income = income;
	}

	public void pay()
	{
		System.out.println("celebraty tax : "+(0.2*income));
	}
}
class Employee implements TaxPay
{
	String empName;
	float salary;
	Employee()
	{
		
	}
	
	public Employee(String empName, float salary) 
	{
		this.empName = empName;
		this.salary = salary;
	}

	public void pay()
	{
		if(salary>500000)
		{
		System.out.println("employee tax : "+(0.1*salary));
		}
		else
		{
			System.out.println("Salary is tax free.");
		}
	}
	

}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Celebraty c1=new Celebraty("Akshay kumar",8000000);
		c1.pay();
		System.out.println("--------------------------------------");
		Employee e1=new Employee("Dipti",700000);
		e1.pay();
		System.out.println("--------------------------------------");
		Employee e2=new Employee("Hari",400000);
		e2.pay();
	}

}
