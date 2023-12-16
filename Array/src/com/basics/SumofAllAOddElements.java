package com.basics;
import java.util.Scanner;
// find an element from 
public class SumofAllAOddElements {
	static void sumOddElement(int a[])
	 {
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				sum+=a[i];
			}
		}
		System.out.println("sum: "+sum);
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
		sumOddElement(arr);
		
		
		
  
	}

}
