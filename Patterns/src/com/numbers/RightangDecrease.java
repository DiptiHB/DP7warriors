package com.numbers;

import java.util.Scanner;

public class RightangDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
     sc.close();
	}

}
