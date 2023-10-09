package com.containment3;

public class Laptop {
	String laptopConfig;
	String lName;
	int price;
	Printer print;
	Laptop()
	{
		
	}
	Laptop(String laptopConfig,String lName,int price,Printer print)
	{
		this.laptopConfig=laptopConfig;
		this.lName=lName;
		this.price=price;
		this.print=print;
	}
	public void setLaptopConfig(String laptopConfig)
	{
		this. laptopConfig=laptopConfig;
	}
	public String getLaptopConfig()
	{
		return  laptopConfig;
	}
	public void setLname(String lName)
	{
		this.lName=lName;
	}
	public String getLName()
	{
		return lName;
	}
	public void setPrice(int price )
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrint(Printer print )
	{
		this.print=print;
	}
	public Printer getPrint()
	{
		return print;
	}
	
	public String toString()
	{
		return "\n config: "+laptopConfig+"\n laptop name: "+lName+"\n price: "+price+"\n printer details: "+print;
	}

	
}
