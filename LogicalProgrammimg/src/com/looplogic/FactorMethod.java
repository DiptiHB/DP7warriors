package com.looplogic;

import java.util.Scanner;

public class FactorMethod {
 static int factorial(int num)
 {  int i;
	int fact=1; 
     for(i=1;i<=num;i++)
		{
			fact*=i;
			
		} 
     return fact;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		//int result=factorial(num);
		//System.out.println(result);
		System.out.println("factorial of number "+ num+"="+ factorial(num));
		 
		sc.close();

	}

}

