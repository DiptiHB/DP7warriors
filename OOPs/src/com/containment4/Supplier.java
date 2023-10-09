package com.containment4;

public class Supplier {
	int sId;
	String name;
	ItemDetail i;
	Supplier()
	{
		
	}
    Supplier(int sId, String name, ItemDetail i) 
    {
		this.sId = sId;
		this.name = name;
		this.i = i;
	}
	
	public void setsId(int sId)
	{
		this.sId=sId;
	}
	public int getsId()
	{
		return sId;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
	public void setI(ItemDetail i)
	{
		this.i=i;
	}
	public ItemDetail getI()
	{
		return i;
	}
	public String toString()
	{
		return "Supplier: \n sId: " + sId + "\n name: " + name + "\n i: " + i;
	}
    
	

}
