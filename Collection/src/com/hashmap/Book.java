package com.hashmap;

public class Book {
	private int bid;
	private String bName;
	private int price;
	private Author author;
	Book()
	{
		
	}
	public Book(int bid, String bName, int price, Author author) {
		super();
		this.bid = bid;
		this.bName = bName;
		this.price = price;
		this.author = author;
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
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bName=" + bName + ", price=" + price + ", author=" + author + "]";
	}
	
}
