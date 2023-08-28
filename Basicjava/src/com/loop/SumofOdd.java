package com.loop;

import java.util.Scanner;

public class SumofOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number till you want addtion of even numbers: ");
		int num=sc.nextInt();
        int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
				{
				sum+=i;
				}
		}
		System.out.println("sum of all odd number: "+sum );
		sc.close();

	}

}
