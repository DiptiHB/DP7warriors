package com.treemap;

public class Customer implements Comparable<Customer>{
	private int id;
	private String name;
	private Long mNo;
	Customer()
	{
		super();
		
	}
	public Customer(int id, String name, Long mNo) {
		super();
		this.id = id;
		this.name = name;
		this.mNo = mNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getmNo() {
		return mNo;
	}
	public void setmNo(Long mNo) {
		this.mNo = mNo;
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.getId()-o.getId();
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mNo=" + mNo + "]";
	}
	
	
	
}
