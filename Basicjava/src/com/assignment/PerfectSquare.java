package com.assignment;

import java.util.Scanner;

public class PerfectSquare {
	static boolean checkPerfectSq(int n)
	{
		if(n==1)
			return true;
		
		else
		{
			for(int i=1;i<=n/2;i++)
			{
				if((i*i)==n)
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		
		int num= sc.nextInt();
		
		if(checkPerfectSq(num))
			System.out.println("Perfect square");
		else
			System.out.println("Not a perfect square");
		
		sc.close();

	}

}
