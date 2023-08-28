package com.switchst;

import java.util.Date;
import java.util.Scanner;

public class AtmSwitch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Date dt= new Date();
	System.out.println("WELCOME TO HDFC ATM!");
	int code=123445;
	int balance=200000;
	String username="dipti";
	System.out.println("enter your user name: ");
	String name=new String();
	name=sc.next();
	System.out.println("enter your pin: ");
	int pin=sc.nextInt();
	
	if(pin==code && name.equals(username))
	{
		System.out.println("Welcome "+username);
	
	
	System.out.println("Enter you choice1-deposit/2-withdraw/3-check balance/4-exit: ");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
        System.out.println("enter ammount to be deposit: ");
		int deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("you deposited ammount is: "+deposit);
		System.out.println(name+" your balance is:"+balance);
		break;
		
	case 2:
		System.out.println("enter ammount to be withdraw: ");
		int withdraw=sc.nextInt();
		balance=balance-withdraw;
		System.out.println("you withdrawal ammount is: "+withdraw);
		System.out.println(name+" your balance is: "+balance+" on date"+dt);
		break;
		
	case 3:
		System.out.println(name+" your balance is: "+balance);
		break;
	
	case 4:
		System.out.println("exited ");
	default:System.out.println("enter correct choice.");
	}
	}
	
	else
	{
		System.out.println("enter correct pin.");
		
	}
	sc.close();	

	}

}
