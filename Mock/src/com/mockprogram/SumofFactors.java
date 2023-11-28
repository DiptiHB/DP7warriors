package com.mockprogram;

import java.util.Scanner;

public class SumofFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		int n=num;
		int sum=0;
		int i=1;
		int high=1;
		for( i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.print(""+i+" ");
				sum=sum+i;
			
		      if(i>high)
			   {
				high=i;
			   }
			}
			
		}
		System.out.println("\nsum= "+sum);
		System.out.println("higher factor is: "+high);
		
	

	}

}
