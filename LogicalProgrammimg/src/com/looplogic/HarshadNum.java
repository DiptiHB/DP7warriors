package com.looplogic;

import java.util.Scanner;

public class HarshadNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		int origin=num;
		
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.println("sum="+sum);
		if (origin%sum==0)
		{
			System.out.println(origin+" number is Harshad number");
		}
		else
		{
			System.out.println(origin+" number is not harshad number.");
		}
sc.close();
	}

}
