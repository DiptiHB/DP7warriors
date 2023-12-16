package com.treeset;

public class Book {
	private int bid;
	private String bName;
	private int price;
	
	Book()
	{
		
	}
	public Book(int bid, String bName, int price) {
		super();
		this.bid = bid;
		this.bName = bName;
		this.price = price;
		
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "\nBook id=" + bid + "Name=" + bName + "price=" + price ;
	}
	

}
