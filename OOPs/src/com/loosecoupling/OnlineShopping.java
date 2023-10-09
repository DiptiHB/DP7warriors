package com.loosecoupling;
interface payment
{
public void doTrasaction(double amount);	
}
class CreditCard implements payment
{
	private int cardNo;
	private int cvv;
	private double limit;
	CreditCard()
	{
		
	}
	
	
	public CreditCard(int cardNo, int cvv, double limit) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.limit = limit;
	}
	


	public int getCardNo() 
	{
		return cardNo;
	}

	public int getCvv() 
	{
		return cvv;
	}

	public double getLimit()
	{
		return limit;
	}
	public void setLimit(double limit) 
	{
		this.limit = limit;
	}


	public void doTrasaction(double amount)
	{
		if((this.limit-amount)>0)
		{
			System.out.println("your credit card is debited : "+amount);
			this.limit-=amount;
		}
		else
		{
			System.out.println("sorry..insufficient balance!!");
		}
	}

}
class DebitCard implements payment
{
	private int cardNo;
	private double balance;
	DebitCard()
	{
		
	}
	
	public DebitCard(int cardNo, double balance)
	{
		super();
		this.cardNo = cardNo;
		this.balance = balance;
	}
	

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void doTrasaction(double amount)
	{
		if((this.balance-amount)>=1000)
		{
			System.out.println("your debit card debited by : "+amount);
			this.balance-=amount;
		}
		else
		{
			System.out.println("sorry..insufficient balance!!");
		}
		
	}
}
public class OnlineShopping {
	String name;
	long mobNo;
	OnlineShopping()
	{
		
	}
	
	public OnlineShopping(String name, long mobNo) {
		super();
		this.name = name;
		this.mobNo = mobNo;
	}
	public void payBill(payment p,float amt,float discount)
	{
		amt=amt-((discount/100)*amt);
		p.doTrasaction(amt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineShopping o1=new OnlineShopping("Dipti",91464622);
		CreditCard c1=new CreditCard(21212,333,200000);
		o1.payBill(c1, 45000f, 10f);
		DebitCard d1=new DebitCard(3232,300000);
		o1.payBill(d1, 200000f, 15f);

	}

}
