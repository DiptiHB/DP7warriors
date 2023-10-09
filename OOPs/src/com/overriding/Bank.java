package com.overriding;
import java.util.Scanner;
class Account
{
	private int  accountId;
	private String name;
	protected float balance;
	protected float rateOfInterest;
	Account()
     {
    	 
	 }
	public Account(int accountId, String name, float balance) 
	{
		this.accountId=accountId;
		this.name=name;
		this.balance=balance;
	
	}
	
	public void setAccountId(int accountId) 
	{
		this.accountId=accountId;
	}
	public int getAccountId() 
	{
		return accountId;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
	
	public void setBalance(float balance) 
	{
		this.balance=balance;
	}
	public float getBalance() 
	{
		return balance;
	}
	public float getRateOfInterest()
	{
		rateOfInterest=5f;
		return rateOfInterest;
	}
	void deposit(float ammount)
	{
		balance+=ammount;
	}
	void withdraw(float ammount)
	{
		balance-=ammount;
	}
	
}
class SavingAccount extends Account

{
	
	private String panNumber;
	SavingAccount()
	{
		super();
	}
	SavingAccount(int accountId, String name, float balance,String panNumber)
	{
		super(accountId,name,balance);
		this.panNumber=panNumber;
		
	}
	
	public void setPanNumber(String panNumber) 
	{
		this.panNumber=panNumber;
	}
	public String getPanNumber()
	{
		return panNumber;
	}
	public float getRateOfInterest()
	{
		rateOfInterest=7.5f;
		return rateOfInterest;
	}
	void deposit(float ammount)
	{
		float b=balance+ammount;
		if(b>50000)
		{
			if(panNumber!=null)
			{
				balance=b;
			}
			
			else
			{
				System.out.println("please enter your pan number!!");
			}
		}
		
	}
	void withdraw(float ammount)
	{
		if(balance-ammount>1000)
		{
		balance-=ammount;
		}
		else
		{
			System.out.println("SORRY !ensufficient balance! "+balance); 
		}
		
	}

}


public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account(1012,"Dipti",1000);
		System.out.println("\n account no: "+a1.getAccountId()+"name: "+a1.getName()+"\n balance:  "+a1.getBalance());
		
		System.out.println("rate of interest : "+a1.getRateOfInterest());
		a1.withdraw(800);
		System.out.println("balance is: "+a1.getBalance());
		a1.deposit(70000);
		System.out.println("balance is: "+a1.getBalance());
		System.out.println("----------------------------------------------------------");
      
		SavingAccount s1=new SavingAccount(1111,"rudrapriya",5000,"VDG856412H");
		System.out.println("\n account no: "+s1.getAccountId()+"name: "+s1.getName()+"\n balance:  "+s1.getBalance());
		System.out.println(" rate of interest: "+s1.getRateOfInterest());
		 s1.withdraw(1000);
		 
		System.out.println(" balance is: "+s1.getBalance());
		s1.deposit(50000);
		System.out.println(" balance is: "+s1.getBalance());
		System.out.println("----------------------------------------------------------------");
		System.out.println("PAN number: "+s1.getPanNumber());
	        
		System.out.println(" balance is: "+s1.getBalance());
		
	}

}
