package com.containment9;

public class Depatment {
	private int deptId;
	private String deptName;
	private String location;
	
	
	Depatment()
	{
		
	}
	Depatment(int deptId,String deptName,String location)
	{
		this.deptId=deptId;
		this.deptName=deptName;
		this.location=location;
	}
	public void setDeptId(int deptId)
	{
		this.deptId=deptId;
	}
	public int getDeptId()
	{
		return deptId;
	}
	public void setDeptName(String deptName)
	{
		this.deptName=deptName;
	}
	public String getDeptName()
	{
		return deptName;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getLocation()
	{
		return location;
	}
	public String toString()
	{
		return "\n dept id: "+deptId+"\n dept Name: "+deptName+"\n location: "+location;
	}

}
