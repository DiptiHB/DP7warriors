package com.containment2;

public class BookX {
	private int bId;
	private String bName;
	private float price;
	private AurthorX author;
	BookX()
	{
		
	}
	BookX(int bId,String bName,float price,AurthorX author)
	{
		this.bId=bId;
		this.bName=bName;
		this.price=price;
		this.author=author;
	}
	
	public void setBId(int bId)
	{
		this.bId=bId;
	}
	public int getBId()
	{
		return bId;
	}
	public void setBName(String bName)
	{
		this.bName=bName;
	}
	public String getBName()
	{
		return bName;
	}
    public void setPrice(float price)
    {
    	this.price=price;
    }
    public float getPrice()
    {
    	return price;
    }
    public void setAuthor(AurthorX author)
	{
		this.author=author;
	}
	public AurthorX getAuthor()
	{
		return author;
	}
    public String toString()
    {
    	return "\n book id: "+bId+"\n book name: "+bName+"\n price: "+price+"\n author details : "+author;
    }
}
