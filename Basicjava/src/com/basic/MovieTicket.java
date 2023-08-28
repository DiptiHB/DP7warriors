package com.basic;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("WELCOME TO Entertainment Hub..!");
	    System.out.println("movie:Gadar2 = 500₹ and movie rating is 4.9");
	    System.out.println("movie:Barbie = 800₹ and movie rating is 4.5");
	    System.out.println(" Enter movie name you want to watch:");
		String mName=sc.next();
		
		System.out.println(" Enter 0/1 if you want discount..[0=50₹ off and 1=100₹]");
		int code=sc.nextInt();
		int price1=500;
		int price2=800;
		String gadar2="gadar2";
	   if (code<2)
	   {
		if(code==0)
		{
			
			if(mName.equals(gadar2))
					{
				System.out.println("WOW..nice choice!! you have choosen movie Gadar2!");
				price1=price1-50;
				System.out.println("your ticket price is: "+price1+"₹");
					}
			else
			{
				System.out.println(" you have choosen movie Barbie! seems like you are fan of Barbie!!");
				price2=price2-50;
				System.out.println("your ticket price is :"+price2+"₹");
			}
			
		}
		else
		{
			if(mName.equals(gadar2))
			{
		System.out.println("WOW..nice choice!! you have choosen movie Gadar2!");
		price1=price1-100;
		System.out.println("your ticket price is: "+price1+"₹");
			}
	        else
	         {
		       System.out.println(" you have choosen movie Barbie! seems like you are fan of Barbie!!");
		       price2=price2-100;
		       System.out.println("your ticket price is: "+price2+"₹");
	         }
			
		}
	  }
   else
			
		{
			System.out.println("wrong code choosen..");
			if(mName.equals(gadar2))
			{
				System.out.println("your ticket price is :"+price1+"₹");
			}
		else
			{
				System.out.println("your ticket price is: "+price2+"₹");
			}
			
		}
	   System.out.println("***Enjoy your show!!***");
	   sc.close();
	   }
	
			
	
		
		
		
	}

