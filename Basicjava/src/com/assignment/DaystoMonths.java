package com.assignment;

import java.util.Scanner;

public class DaystoMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of days: ");
		int days=sc.nextInt();
		double month=days/30;
		
		System.out.println("number of month are: "+month);
	
		sc.close();
	

	}

}
