package com.switchst;

import java.util.Scanner;

public class SwitchEvenOdd {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number you want to print 1.Even 2.Odd:" );
	    int print=sc.nextInt();
	    
	    System.out.println("Enter number");
	    int n=sc.nextInt();
	    
	    switch(print)
	    {
	    case 1: 
	    	if(n%2==0)
	    	{
	    	System.out.println(n+" number is even..!");
	    	}
	    	else 
	    	{
	           System.out.println(n+" number is odd..!");
	    	}
	    	break;
	    default:
	    	System.out.println("Exit");
	    }
	    sc.close();
	    
	} 

}
