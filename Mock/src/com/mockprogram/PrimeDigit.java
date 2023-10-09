package com.mockprogram;
import java.util.Scanner;
public class PrimeDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		int count;
		int rem = 0;
		while (num != 0) 
		{
			rem = num % 10;
			num /= 10;
			count = 0;
			for (int i = 2; i <= rem; i++) 
			{
				if (rem % i == 0)
				{
					count++;
				}
			}
			if (count == 1) 
			{
				System.out.println("Prime Number: " + rem);
			}

	    }
	}
}
