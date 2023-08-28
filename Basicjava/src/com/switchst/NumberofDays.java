package com.switchst;

import java.util.Scanner;

public class NumberofDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month name:" );
		String mName=sc.next();
        switch(mName)
        {
        case "january":
        case "march":
        case "may":
        case "july":
        case "agust":
        case "october":
        case "december":System.out.println("31 days");
              break;
        case "april":
        case "june":
        case "september":
        case "november":System.out.println("30 days");
        break;
        
        case "february":System.out.println("enter the year");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0)
	    {
	    	System.out.println(" 29 days");
	    	
	    }
        else
        {
        	System.out.println(" 28 days");
        }
        break;
        default :System.out.println(" you have enterd wrong input");
        }
        sc.close();
	}

}
