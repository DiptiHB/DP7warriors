package com.loop;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
	
		int add=0;
		for(int i=num;i!=0;i=i/10)
		{
		 int rem=i%10;
		 add=add+rem;
		}
		System.out.println("the addition of given number digits are: "+add );
		sc.close();

	}

}
