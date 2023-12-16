package com.basics;
import java.util.Arrays;
//. Accept number from user and add table of number in array and display
import java.util.Scanner;
public class TableOfNum {
	static  void table(int a[],int n)
	{
		int b[]=new int[a.length];
		int ans=0;
		for(int i=0;i<a.length;i++)
		{
			ans=n*a[i];
			b[i]=ans;
		}
		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("..................WELCOME TO TABLE CREATION...................");
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		table(arr,n);
	}

}
