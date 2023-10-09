package com.containment2;

public class AurthorX {
	private int id;
	private String aName;
	AurthorX()
	{
		
	}
	AurthorX(int id ,String aName)
	{
		this.id=id;
		this.aName=aName;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setAName(String aName)
	{
		this.aName=aName;
	}
	public String getAName()
	{
		return aName;
	}
	public String toString()
	{
		return "\n id: "+id+"\n Author name: "+aName;
	}

}
