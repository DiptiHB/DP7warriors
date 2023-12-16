package com.containmentInherit;

public class Building {
	String bName;
	String lCode;
	Flat f;
	
	 Building()
	 {
		 
	 }
	 Building(String bName,String lCode,Flat f)
	 {
		 this.bName=bName;
		 this.lCode=lCode;
		 this.f=f;
	 }
	
	public void setbName(String bName) 
	{
		this.bName=bName;
	}
	public String getbName() 
	{
		return bName;
	}
	
	public void setlCode(String lCode) 
	{
		this.lCode=lCode;
	}
	public String getlCode()
	{
		return lCode;
	}
	
	public void setF(Flat f) 
	{
		this.f=f;
	}
	public Flat getF() 
	{
		return f;
	}
	public String toString() {
		return "Building details:\n bName: " + bName + "\n lCode: " + lCode + "\n flat details: " + f ;
	}
	 
}
