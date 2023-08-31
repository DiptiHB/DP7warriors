package com.loop;

import java.util.Scanner;

public class ProductofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
	
		int mul=1;
		for(int i=num;i!=0;i=i/10)
		{
		 int rem=i%10;
		 mul=mul*rem;
		}
		System.out.println("the product of given number digits are: "+mul );
		sc.close();
	}

}
