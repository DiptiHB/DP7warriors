package com.looplogic;

import java.util.Scanner;

public class ReversenumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		int original=num;
		
		int rev=0;
		for(int i=num;i!=0;i=i/10)
		{
		 int rem=i%10;
		 rev=rev*10+rem;
		}
		System.out.println("the revese of given number digits are: "+rev );
		result=original-rev;
		System.out.println("number: "+num+"--->"+ result);
        sc.close();
	}

}
