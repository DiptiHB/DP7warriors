package com.switchst;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weekday number:" );
		int weeknumber=sc.nextInt();
		switch(weeknumber)
		{
		case 1:System.out.println("monday");
		       break;
		case 2:System.out.println("tuesday");
	       break;
		case 3:System.out.println("wednesday");
	       break;
		case 4:System.out.println("thursday");
	       break;
		case 5:System.out.println("friday");
	       break;
		case 6:System.out.println("saturday");
	       break;
		case 7:System.out.println("sunday");
	       break;
		default:System.out.println("error in input");
	       
		}
		System.out.println("have a beautiful day..!");
         sc.close();
	}

}
