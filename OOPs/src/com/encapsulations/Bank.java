package com.encapsulations;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer id: ");
		int id=sc.nextInt();
		System.out.println("enter customer name: ");
		String name1=sc.next();
		System.out.println("enter Account number: ");
		int accNo=sc.nextInt();
		Customer c1=new Customer();
		
		c1.setCustomerId(id);
		c1.setName(name1);
		c1.setAccountNo(accNo);
		c1.setBalance(100000);
		System.out.println("id: "+c1.getCustomerId()+" name "+c1.getName()+" account no: "+c1.getAccountNo()+" balance: "+c1.getBalance());
		
		System.out.println("enter the operation you want to perform enter 'c 'for credit and 'd' for debit.");
		char t=sc.next().charAt(0);
		int balance1;
		if(t=='c')
		{
			System.out.println("how much ammount you wanrt to credit: ");
			int credit=sc.nextInt();
		    balance1=c1.getBalance();
			balance1=balance1+credit;
			c1.setBalance(balance1);
			System.out.println("your final balance is: "+balance1);
			
		}
		else
		{
			System.out.println("how much ammount you want to debit: ");
			int credit=sc.nextInt();
			 balance1=c1.getBalance();
			balance1=balance1-credit;
			c1.setBalance(balance1);
			System.out.println("your final balance is: "+balance1);
		}
		sc.close();
        
	}

}
