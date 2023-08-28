package com.basic;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	String name=sc.next(); 
	System.out.println("Enter prize suger per kg");
	int sugar=sc.nextInt();//prize per kg
	System.out.println("Enter prize of wheat per kg");
	int wheat=sc.nextInt();//prize per kg
	System.out.println("Enter prize rice per kg");
	int rice=sc.nextInt();
	System.out.println("suger brought (in kg): ");
	int suga=sc.nextInt();
	
	System.out.println("wheat brought (in kg): ");
	int wht=sc.nextInt();
	
	System.out.println("rice brought (in kg): ");
	int rc=sc.nextInt();
	double total=sugar*suga+wheat*wht+rice*rc;
	     System.out.println("name: "+name);
		 System.out.println("Total bill is: "+total);
		 System.out.println("THANK YOU,VISIT AGAIN!!");
		 sc.close();
	}

}
