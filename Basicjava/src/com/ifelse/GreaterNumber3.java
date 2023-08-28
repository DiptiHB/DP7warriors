package com.ifelse;

import java.util.Scanner;

public class GreaterNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number 1:");
	    int num1=sc.nextInt();
	    System.out.println("enter number 2:");
	    int num2=sc.nextInt();
	    System.out.println("enter number 3:");
	    int num3=sc.nextInt();
	    if(num1>num2 && num1>num3)
	    {
	    	System.out.println(num1+" is greater.");
	    }
	    else if(num2>num3)
	    {
           System.out.println(num2+" is greater");
	    }
	    else
	    {
	    	System.out.println(num3+" is greater");
	    }
	    sc.close();
	}

}
