package com.containmentInherit;


public class Flat {
	int flatNo;
	int members;
	Flat ()
	{
		
	}
	Flat (int flatNo,int members)
	{
		this.flatNo=flatNo;
		this.members=members;
		
	}
	public void setFlatNo(int flatNo)
	{
		this.flatNo = flatNo;
	}
	public int getFlatNo() 
	{
		return flatNo;
	}
	
	public void setMembers(int members) 
	{
		this.members = members;
	}
	public int getMembers()
	{
		return members;
	}
	public String toString() {
		return "Flat details: \nflatNo:" + flatNo + "\n members=" + members;
	}
	


}
