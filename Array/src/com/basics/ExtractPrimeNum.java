package com.basics;
import java.util.*;
public class ExtractPrimeNum {
	static void prime(int a[])
	{
		int sum=0;
		boolean status=false;
		for(int j=0;j<a.length;j++)
		{
			status=false;
			for(int k=2;k<a[j];k++)
			{
				if(a[j]%k==0)
				{
					status=true;
				}
			}
			if(status==false)
			{
				System.out.print(" "+a[j]);
				sum+=a[j];
			}
			
		}
		System.out.println("\n Sum of prime number: "+sum);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size of array: ");
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<arr.length;i++)
     {
    	System.out.println("enter values: ");
    	arr[i]=sc.nextInt();
     }
     System.out.println(Arrays.toString(arr));
     prime(arr);
	}

}
