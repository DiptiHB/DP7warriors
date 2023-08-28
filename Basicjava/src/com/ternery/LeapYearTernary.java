package com.ternery;

import java.util.Scanner;

public class LeapYearTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
        int year=sc.nextInt();
        String op=((year%4==0 && year%100!=0 || year%400==0))?"yes":"no";
        System.out.println(year+":"+op + " is leap year");
        
        sc.close();
       //(year%4==0 && year%100!=0 || year%400==0)

	}

}
