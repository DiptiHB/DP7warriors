package com.containment6;

public class Person {
	String name;
	char Gender;
	int age;
	Address add;
	Person()
	{
		
	}
	public Person(String name, char gender, int age, Address add) 
	{
		this.name = name;
		Gender = gender;
		this.age = age;
		this.add = add;
	}

	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setGender(char gender) 
	{
		Gender=gender;
	}
	public char getGender() 
	{
		return Gender;
	}
	
	public void setAge(int age) 
	{
		this.age=age;
	}
	public int getAge() 
	{
		return age;
	}
	
	public void setAdd(Address add) 
	{
		this.add=add;
	}
	public Address getAdd() 
	{
		return add;
	}
	
	public String toString() 
	{
		return "Person details: \n name: " + name + "\n Gender: " + Gender + "\n age: " + age + "\n add: " + add;
	}
	
	

}
