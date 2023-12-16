package com.custumexception3;
class Account
{
	int id;
	String name;
	int balance;
	public Account() {
		
	}
	public Account(int id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
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
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	void deposit(int amt)
	{
		balance+=amt;
		System.out.println("Amount deposited: "+amt);
		System.out.println("your balance is: "+balance);
		
	}
	void withdraw(int amt)
	{
		try
		{
			if((balance-amt)<0)
			{
				throw new InsufficientBalance("your balance is insufficient!");
			}
			this.balance-=amt;
			System.out.println("your ammount to withdraw: "+amt);
			System.out.println("your balance is: "+this.balance);
		}
		catch(InsufficientBalance e)
		{
			System.out.println(e);
		}
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		a.setId(111);
		a.setName("Dipti");
		a.setBalance(100000);
		System.out.println("---------------------");
		a.deposit(1000);
		System.out.println("---------------------");
		a.withdraw(150000);
		System.out.println("---------------------");
		a.deposit(5000);
		System.out.println("---------------------");
		a.withdraw(15000);

	}

}
