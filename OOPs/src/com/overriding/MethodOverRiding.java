package com.overriding;
class Person
{
	void display()
	{
		System.out.println("i am person");
	}
	
	
}
class Employee extends Person
{
	void display()
	{
		System.out.println("i am employee");
		
	}
	
}
class Celebrety extends Person
{
 void display()
 {
	 System.out.println("i am celebraty");
 }
}

public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.display();
		
		Employee e1=new Employee();
		e1.display();
		
		Celebrety c1=new Celebrety();
		c1.display();

	}

}
