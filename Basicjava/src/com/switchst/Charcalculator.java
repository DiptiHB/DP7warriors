package com.switchst;

import java.util.Scanner;

public class Charcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2=sc.nextInt();
		double result;
		System.out.println("Enter the operation you want to perform from add: '+', substraction:'-',multiplication: '*', divide:'/', modulus:'%' = ");
		char op=sc.next().charAt(0);
		switch(op)
		{
		case '+':
			 result=num1+num2;
			 System.out.println(+result);
			break;
		case '-':
			result=num1-num2;
			System.out.println(+result);
			break;
		case '*':
		    result=num1*num2;
		    System.out.println(+result);
			break;
		case '/':
			 result=num1/num2;
			 System.out.println(+result);
			break;
		case '%':
			 result=num1%num2;
			 System.out.println(+result);
			break;
			default:
				System.out.println("enter correct choice.");
				
		}
		sc.close();

	}

}
