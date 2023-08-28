package com.loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long fact=1;
		System.out.println("enter number: ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("factorial of number is: "+fact);
       sc.close();
	}

}
/* for(int i=num;i>0;i--)
 {
  fact*=i; 
 }   */
 