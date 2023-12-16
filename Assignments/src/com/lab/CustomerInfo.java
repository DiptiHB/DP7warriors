package com.lab;
class Customer
{
	int customerId;
	String name;
	Customer()
	{
		
		
	}
	Customer(int customerId, String name)
	{
		this.customerId=customerId;
		this.name=name;
	}
	void display()
	{
		System.out.println("customer id: "+customerId+"\nname: "+name);
	}
//	public String toString()
//	{
//		return "\n customer id: "+customerId+"\n name: "+name;
//	}
}
class Bankcustomer extends Customer
{
	float balance;
	Bankcustomer()
	{
		super();
	}
	Bankcustomer(int customerId, String name,float balance)
	{
		super(customerId,name);
		this.balance=balance;
	}
	void display()
	{
		super.display();
		System.out.println("balance: "+balance);
	}
//	public String toString()
//	{
//		return super.toString()+"\n balance: "+balance;
//	}
}
class LoanCustomer extends Customer
{
	int loanId;
	int loanAmmount;
	int t;
	float r;
	LoanCustomer()
	{
	super();	
	}
	LoanCustomer(int customerId, String name,int loanId,int loanAmmount,int t,float r)
	{
		super(customerId,name);
		this.loanId=loanId;
		this.loanAmmount=loanAmmount;
		this.t=t;
		this.r=r;
	}
	void display()
	{
		super.display();
		float ans=loanAmmount*t*r;
		System.out.println("amount for loan: "+loanAmmount);
		System.out.println("time: "+t);
		System.out.println("rate: "+r);
		System.out.println(" your total ammount to return: "+ans);
	}
//	public String toString() {
//		return "\n loanId: " + loanId + "\n loanAmmount: " + loanAmmount + "\n t:" + t + "\n r: " + r;
//	}
	
	
}
public class CustomerInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankcustomer b1=new Bankcustomer(111,"Dipti",100000);
		//System.out.println(b1);
		b1.display();
         System.out.println("----------------------------------------------------------------");
		LoanCustomer l1=new LoanCustomer(222,"sharu",101,250000,3,5.8f);
		//System.out.println(l1);
		l1.display();
		
	}

}
