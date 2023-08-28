package com.basic;

import java.util.Scanner;

public class Divisibleby5and7 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter number: ");
	    int num=sc.nextInt();
	    if(num%5==0 && num%7==0)
	    {
	    	System.out.println(num+" number is completely divisible by 5 and 7");
	    	
	    }
	    else
	    {
	    	System.out.println(num+" number is not divisible by 5 and 11");
	    }
	    sc.close();
		
	}
}
