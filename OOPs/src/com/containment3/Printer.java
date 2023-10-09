package com.containment3;

public class Printer {
	int printId;
	String printName;
	int pPrice;
	Printer()
	{
		
		
	}
	Printer(int printId, String printName,int pPrice)
	{
		this.printId=printId;
		this.printName=printName;
		this.pPrice=pPrice;
	}
	public void setPrintId(int printId )
	{
		this.printId=printId;
	}
	public int getPrintId()
	{
		return printId;
	}
	public void setPrintName(String printName)
	{
		this.printName=printName;
	}
	public String getprintName()
	{
		return printName;
	}
	public void setPPrice(int pPrice )
	{
		this.pPrice=pPrice;
	}
	public int getPPrice()
	{
		return pPrice;
	}
	
	
	public String toString()
	{
		return "\n printer Id: "+printId+"\n printer name: "+printName+"\n printer price: "+pPrice;
	}

}
