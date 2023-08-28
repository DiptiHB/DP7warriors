package com.conditional;

import java.util.Scanner;

public class NumberofDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month number like for january press 1 and so on till 12-december.." );
		int mName=sc.nextInt();
		if(mName==1 || mName==3 || mName==5 || mName==7 || mName==8 ||mName== 10 || mName==12)
		{
			System.out.println("Number of months are 31.");
		}
		else if( mName==4 || mName==6 || mName==9 || mName==11)
		{
			System.out.println("number of days are 30.");
		}
		else
		{
			System.out.println("enter the year: ");
	        int year=sc.nextInt();
	        if(year%4==0 && year%100!=0 || year%400==0)
		    {
		    	System.out.println("29 days");
		    	
		    }
	        else
	        {
	        	System.out.println("28 days");
		    }
		}
		sc.close();
	}

}
