package com.inheritance;

class University
{
	String universityName;
	int uniCode;
	
	University()
	{
		
	}
	University(String universityName,int uniCode)
	{
	this.universityName=universityName;
	this.uniCode=uniCode;
	}
	
	public void setUniversityName(String universityName) 
	{
		this.universityName=universityName;
	}
	public String getUniversityName() 
	{
		return universityName;
	}
	
	public void setUniCode(int uniCode)
	{
		this.uniCode=uniCode;
	}
	public int getUniCode()
	{
		return uniCode;
	}
	public String toString()
	{
		return "\n University: "+universityName+"\n university code: "+uniCode;
	}
	
}
class Depatment extends University
{
	int deptId;
	String deptName;
	String deptHead;
	Depatment()
	{
		super();
	}
	Depatment(String universityName,int uniCode,int deptId,String deptName,String deptHead )
	{
	super(universityName,uniCode);	
	this.deptId=deptId;
	this.deptName=deptName;
	this.deptHead=deptHead;	
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
	public void setDeptHead(String deptHead)
	{
		this.deptHead=deptHead;
		
	}
	public String getDeptHead()
	{
		return deptHead;
	}
	public String toString()
	{
		return super.toString()+"\n department id: "+deptId+"\n department name: "+deptName+"\n HOD name: "+deptHead;
	}
	
}
public class UniversityDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
