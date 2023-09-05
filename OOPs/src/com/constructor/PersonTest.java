package com.constructor;

import java.util.Scanner;

class person // another class with default access .
{
	private int id;
	private String name;
	private int age;
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
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
		
	}
	public person()//constructor
	{
		id=111;
		name="unknown";
		age=18;
	}
	
	public String toString()
	{
		return id+" "+name+" "+age;
	}
	
	
}

public class PersonTest {  // main class having main method is your class name.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 person p=new person();
		 System.out.println("enter employee id: ");
		 p.setId(sc.nextInt());
		 System.out.println("enter name of enployee: ");
		 p.setName(sc.next());
		 System.out.println("enter age: ");
		 p.setAge(sc.nextInt());
		 
		 System.out.println("id: "+p.getId()+" name: "+p.getName()+" Age: "+p.getAge());
		 
		 sc.close();
	}

}
