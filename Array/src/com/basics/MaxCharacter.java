package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class MaxCharacter {
	static void maxChar(char a[])
	{
		char max=0;
		//System.out.println(Integer.max(10, 20));
		 for(int i=0;i<a.length;i++)
		  {
			 
			 if(a[i]>max)
			 {
				 max=a[i];
				 
			 }
		  }
		  System.out.println("maximum char is: "+max);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter size of array: ");
	     int n=sc.nextInt();
	     char arr[]=new char[n];
	     for(int i=0;i<arr.length;i++)
	     {
	    	System.out.println("enter values: ");
	    	arr[i]=sc.next().charAt(0);
	     }
	     System.out.println(Arrays.toString(arr));
	     maxChar(arr);
	}

}
