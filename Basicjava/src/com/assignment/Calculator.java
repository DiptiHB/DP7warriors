package com.assignment;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2=sc.nextInt();
		double result;
		
		
		System.out.println("Enter the operation you want to perform from +, -, *, /, % : ");
		char op=sc.next().charAt(0); 
		
		 if(op=='+')
        { 
			 result=num1+num2;
			 
        	System.out.println("addition of numbers is :"+result);
        }
        else if(op=='-')
        {
        	result=num1-num2;
        	System.out.println("Substraction of numbers is :"+result);
        }
        else if(op=='*')
        {
        	result=num1*num2;
        	System.out.println("multiplication of numbers is :"+result);
        }
        else if(op=='/')
        {
        	result=num1/num2;
        	System.out.println("div of numbers is :"+result);
        }
        else
        {
        	result=num1%num2;
        	System.out.println("remainder of numbers is :"+result);
        }
        sc.close();
	}

}
