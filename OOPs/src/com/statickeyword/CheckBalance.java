package com.statickeyword;

import java.util.Scanner;

class BankBalance
{
	private int id;
	private String name;
	private int debitAmmount;
	static int balance;
	int ch;
	static
	{
	balance=200000;	
	}
	BankBalance()
	{
		
	}
	BankBalance(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	void debit()
	{
		switch(ch)
		{
		case 1:
			System.out.println("you have choosen UPI!");
			balance=balance-debitAmmount;
			break;
		case 2: 
			System.out.println("you are using debit card!");
			balance=balance-debitAmmount;
			break;
		case 3:
			System.out.println("you are debiting money from ATM! !");
			balance=balance-debitAmmount;
		}
		
		System.out.println("your balance is: "+balance);
	}
	
	
	public void setDebitAmmount(int debitAmmount) 
	{
		this.debitAmmount = debitAmmount;
	}
	
	public int getDebitAmmount() 
	{
		return debitAmmount;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return id;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	
	public static void setBalance(int balance) 
	{
		BankBalance.balance = balance;
	}
	public static int getBalance()
	{
		return balance;
	}
	public int getCh() 
	{
		return ch;
	}
	public void setCh(int ch) 
	{
		this.ch = ch;
	}

	public String toString() 
	{
		return "Bank Balance of :\n id: " + id + "\n name:" + name+"\n balance: "+balance;
	}
	

}
public class CheckBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BankBalance b1=new BankBalance(111,"dipti");
		System.out.println(b1);
		System.out.println( "enter your way to debit ammount: ");
		System.out.println("press 1: for UPI,press 2: for debit card,press 3: for ATM debit");
		b1.setCh(sc.nextInt());
		System.out.println(b1.getCh());
		
		System.out.println("enter the ammount you want to debit: ");
		b1.setDebitAmmount(sc.nextInt());
		b1.debit();
		System.out.println("ammount to be debit: "+b1.getDebitAmmount());
		
		

	}

}
