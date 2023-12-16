package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class searchnum2 {
	static void search(int x,int a[])
	{
		boolean isPresent=false;
       for(int i=0;i<a.length;i++)
       {
			if(a[i]==x)
			{
				isPresent=true;
				System.out.println(x+ " number is present in array at position "+(i+1));
				break;
			}
		}
		
		if(!isPresent) 
		{
			System.out.println(x+" number not found");
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner (System.in);
		 int arr[]= {2,5,4,3,8,9,1,7};
		 System.out.println(Arrays.toString(arr));
		 System.out.println("enter number you want to search: ");
		 int x=sc.nextInt();
		 search(x,arr);
	}

}
