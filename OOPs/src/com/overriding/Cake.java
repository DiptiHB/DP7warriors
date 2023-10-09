package com.overriding;

public class Cake {
	private String flavour;
	private static int price;
	
	Cake()
	{
		
	}
	Cake(String flavour,int price)
	{
		this.flavour=flavour;
		this.price=price;
		
	}
	
	public void setFlavour(String flavour)
	{
		this.flavour=flavour;
	}
	public String getFlavour()
	{
		return flavour;
	}
	public void setPrice(int price)
	{
		Cake.price=price;
	}
	public static int getPrice()
	{
		return price;
	}
	public String toString()
	{
		return "\n flavour: "+flavour+"\n price: "+price;
	}
	
}
