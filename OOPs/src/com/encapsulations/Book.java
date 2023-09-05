package com.encapsulations;

public class Book {
	private int bookId;
	private String bName;
	private int price;
	
	public void setBookId(int bookId)
	{
		this.bookId=bookId;
	}
	public int getBookId()
	{
		return bookId;
	}
	public void setBName(String bName)
	{
		this.bName=bName;
	}
	public String getBName()
	{
		return bName;
	}
	public void setPrice(int i)
	{
		this.price=i;
	}
	public int getPrice()
	{
		return price;
	}
	public String toString()
	{
		return "Book Id: "+bookId+" Book name: "+bName+ "Book Price:"+price;
	}

}
