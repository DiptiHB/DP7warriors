package com.basic;

import java.util.*;

public class TicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO AIRLAND");
		
		Scanner sc=new Scanner(System.in);
		Date dt= new Date();
		System.out.println("Enter your name: ");
		String name=sc.next();
		System.out.println("Enter Airline name: ");
		String air=sc.next();
		System.out.println("Enter depart place: ");
		String depart=sc.next();
		System.out.println("Enter your destination name: ");
		String des=sc.next();
		double prize=80000;
		System.out.println("Ticket prize is: "+prize);
		System.out.println("Enter your coupon code if you have : ");
		int code=sc.nextInt();
		System.out.println("Enterd coupon code is : "+code);
	     if(code==123456)
	      {
		System.out.println("congratulations we are providing you 10% discount!!");
		double dis=prize*0.1;
		double finalprize=prize-dis;
		System.out.println("your finale ticket prize is: "+finalprize);
			
	      }
	    else
		
	    {
		System.out.println("sorry..!your code doesn't matched..");
		double finalprize1=prize;
		System.out.println("your final prize is: "+finalprize1);
	    }
	    System.out.println("name: "+name);
	    System.out.println("airline name "+air);
	    System.out.println("department place is: "+depart);
	    System.out.println("your destination is: "+des);
	    System.out.println("your ticket is booked on date! " + dt +" ENJOY YOUR HOLIDAY.!");
        sc.close();
		
	}

}
