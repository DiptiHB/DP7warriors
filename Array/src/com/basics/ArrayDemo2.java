package com.basics;

import java.util.*;
public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter value: ");
			arr[i]=sc.nextInt();
		}
		//System.out.println(arr);give hash code.
		System.out.println(Arrays.toString(arr));
	}

}
