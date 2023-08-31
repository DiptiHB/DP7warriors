package com.loop;

import java.util.Scanner;

public class YearSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name employee: ");
		String name=sc.next();
		System.out.println("how many hours work: ");
		int hr=sc.nextInt();
        int perHr=100;
		int annualSal,perday;
		
		if(hr>=6 && hr<=12)
		{
		      perday=perHr*hr;
			  System.out.println("per day salary= ₹"+perday);
			  annualSal=perday*365;
			  System.out.println(name+" annual salary is ₹:"+annualSal);
		     
		   
		}
		else
		   {
			   System.out.println("you are not working according to our terms ");
		   }

	}

}
