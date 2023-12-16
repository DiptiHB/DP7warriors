package com.containment5;

public class Department {
	int id;
	String name;
	Department()
	{
		
	}
	Department(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public String toString()
    {
    	return " \n id: "+id+"\n name: "+name;
	}

}
