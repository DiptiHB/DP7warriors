package com.basics;

import java.util.Scanner;

public class SumOfAlternateElements {
	static void sumAlter(int a[])
	{
		int sum=0;
		for(int j=0;j<a.length;j++)
		{
			if(j%2==0)
			{
			 sum+=a[j];
			}
		}
		System.out.println("sum= "+sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter  size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter elements: ");
			arr[i]=sc.nextInt();
		}
		sumAlter(arr);
	}

}
