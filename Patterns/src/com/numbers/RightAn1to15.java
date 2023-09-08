package com.numbers;

import java.util.Scanner;

public class RightAn1to15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		int count=1;	
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}
		sc.close();

	}

}
