package com.encapsulations;

public class Customer {
	private int customerId;
	private String name;
	private int accountNo;
	private int balance;
	
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	public int getCustomerId()
	{
		return customerId;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAccountNo(int accountNo)
	{
		this.accountNo=accountNo;
	}
	public int getAccountNo()
	{
		return accountNo;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public int getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return " "+customerId+" "+name+" "+accountNo+" "+balance;
	}

}
