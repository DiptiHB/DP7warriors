package com.looplogic;

import java.util.Scanner;

public class ReversenumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		int original=num;
		int rem=0;
		int rev=0;
		int result=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;		
		}
		
		System.out.println("the revese of given number digits are: "+rev );
		result=original-rev;
		if(result>0)
		{
		System.out.println("number: "+original+"--->"+ result);
		}
		else
		{
			System.out.println("0");
		}
        sc.close();
	}

}
