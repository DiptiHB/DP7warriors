package com.loop;

import java.util.Scanner;

public class PrintOdd1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			
		}
		sc.close();

	}

}
