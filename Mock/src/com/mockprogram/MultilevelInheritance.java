package com.mockprogram;
class Customer
{
    int customerId;
	String cName;
	Customer()
	{

	}
	Customer(int customerId,String cName)
	{
		this.customerId=customerId;
		this.cName=cName;
		
	}
	void display()
	{
		System.out.println("\n customer Id: "+customerId+"\n customer name: "+cName);
		
	}

}
class BankConstomer extends Customer

{
	float balance;
	BankConstomer()
	{
		super();
		
	}
	BankConstomer(int customerId,String cName,float balance)
	{
		super(customerId,cName);
		this.balance=balance;
	}
	void display()
	{
		super.display();
		System.out.println("balance: "+balance);
	}
	
}
class LoanCustomer extends BankConstomer
{
	int loanId;
	int time;
	float rate;
	int ammount; // you  want as loan.
	
	LoanCustomer()
	{
		super();
	}
	LoanCustomer(int customerId,String cName,float balance,int loanId,int time,float rate,int ammount)
	{
		super(customerId,cName,balance);
		this.loanId=loanId;
		this.time=time;
		this.rate=rate;
		this.ammount=ammount;
	}
	void display()
	{
		super.display();
		float interest=(ammount*time*rate)/100;
		System.out.println("\n your ammount to be return is: "+interest);
		
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankConstomer b1=new BankConstomer(11,"dipti",250000f);
		b1.display();
		
		LoanCustomer l1=new LoanCustomer(222,"sharvari",500000f,12,3,5.5f,200000);
		l1.display();

	}

}
