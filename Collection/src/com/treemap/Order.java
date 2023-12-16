package com.treemap;

public class Order {
	private int id;
	private String pName;
	private int price;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String pName, int price) {
		super();
		this.id = id;
		this.pName = pName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", pName=" + pName + ", price=" + price + "]";
	}
	
	
	

}
