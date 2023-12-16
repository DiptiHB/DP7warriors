package com.basics;

import java.util.Arrays;
import java.util.Scanner;

/* WAP to replace all negative value with its immediate left elements square. Means 
arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].*/ 


public class ChangebySquare {
	public static void Change(int a[])
	{
		
		
		for(int j=0;j<a.length;j++)
		{
			
			if(a[j]<0)
			{
				
				a[j]=a[j-1]*a[j-1];			
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println("enter elements: ");
        	arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Change(arr);
	}

}
