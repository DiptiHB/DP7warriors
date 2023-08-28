package com.ifelse;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    System.out.println("enter number");
		    int num=sc.nextInt();
		    if(num>=0)
		    {
		    	System.out.println(num+" is positive number");
		    }
		    else
		    {
		    	System.out.println(num+" is negative number");
		    }
		    sc.close();

	}

}
