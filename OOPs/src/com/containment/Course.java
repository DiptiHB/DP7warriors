package com.containment;

public class Course {
	
	private int cId;
	private  String cName;
	private float fees;
	Course()
	{
		
	}
	Course(int cId,String cName,float fees)
	{
	this.cId=cId;
	this.cName=cName;
	this.fees=fees;	
	}
	public void setCId(int cId)
	{
		this.cId=cId;
	}
	public int getCId()
	{
		return cId;
	}
	public void setCName(String cName)
	{
		this.cName=cName;
	}
	public String getCName()
	{
		return cName;
	}
	public void setFees(float fees)
	{
		this.fees=fees;
	}
	public float getFees()
	{
		return fees;
	}
	public String toString()
	{
		return "\n course id: "+cId+"\n cource name: "+cName+"\n fees :"+fees;
		
	}
	
}
