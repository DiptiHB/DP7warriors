package com.constructor;
class Human
{
	int id;
	String name;
	int salary;
	int bonus;
	Human()
	{
		this(111,"Dipti",80000,20000);//calling 2nd constructor
		System.out.println("default constructor");
	}
	Human(int id,String name,int salary,int bonus)// 2nd constructor
	{
		this (0);//calling 3rd constructor
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.bonus=bonus;
	}
	Human(int bonus)//3rd constructor
	{
		this.bonus=bonus;
		System.out.println("Congratulations!!");
	}
	void show()
	{
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("bonus: "+bonus);
		this.display();
	}
	void display()
	{
		System.out.println("you got bonus!!");
	}

}

public class Person2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1=new Human();
		h1.show();

	}

}
