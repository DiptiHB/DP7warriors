package com.containmentEng;

public class Engine {
	private String engineType;
	private int price;
	 
	Engine()
	{
		
	}
	Engine(String engineType,int price)
	{
		this.engineType=engineType;
		this.price=price;
		
	}
	public void setEngineType(String engineType) 
	{
		this.engineType=engineType;
	}
	public String getEngineType() 
	{
		return engineType;
	}
	
	public void setPrice(int price) 
	{
		this.price=price;
	}
	public int getPrice() 
	{
		return price;
	}
	public String toString()
	{
		return "\n Engine type: "+engineType+"\n price: "+price;
	}

}
