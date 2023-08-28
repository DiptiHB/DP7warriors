package com.basic;

import java.util.Date;
import java.util.Scanner;

public class AtmChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Date dt= new Date();
		System.out.println("WELCOME TO HDFC ATM!");
		int code=1234;
		int balance=200000;
		String username="dipti";
		System.out.println("enter your user name: ");
		String name=new String();
		name=sc.next();
		System.out.println("enter your pin: ");
		int pin=sc.nextInt();
		System.out.println("Enter you choice1-deposit/2-withdraw/3-check balance/4-exit: ");
		int choice=sc.nextInt();
		if(pin==code && name.equals(username))
		{
			System.out.println("Welcome "+username);
			
			if(choice==1)
			{
				System.out.println("enter ammount to be deposit: ");
				int deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println("you deposited ammount is: "+deposit);
				System.out.println(name+" your balance is:"+balance);
			}
			else if(choice==2)
			{
				System.out.println("enter ammount to be withdraw: ");
				int withdraw=sc.nextInt();
				balance=balance-withdraw;
				System.out.println("you withdrawal ammount is: "+withdraw);
				System.out.println(name+" your balance is: "+balance+" on date"+dt);
			}
			else if(choice==3)
			{
				System.out.println(name+" your balance is: "+balance);
			}
			else
			{
				System.out.println("exited ");
			}
			System.out.println("THANK YOU FOR VISITING HDFC ATM");
		}
		else
		{
			System.out.println("enter correct pin and user name!! ");
		}
		sc.close();
				

	}

}
