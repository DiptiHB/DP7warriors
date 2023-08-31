package com.loop;

import java.util.Scanner;

public class RevDigitofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		
		int rev=0;
		for(int i=num;i!=0;i=i/10)
		{
		 int rem=i%10;
		 rev=rev*10+rem;
		}
		System.out.println("the revese of given number digits are: "+rev );
		
        sc.close();
	}

}
