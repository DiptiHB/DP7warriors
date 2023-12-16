package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class AddofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter value: ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum= "+sum);
	}

}
