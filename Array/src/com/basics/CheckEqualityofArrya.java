package com.basics;

import java.util.Arrays;

public class CheckEqualityofArrya {
	public static void equal(int a1[],int a2[])
	{
		boolean result=true;
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
				result =false;				
				}		
						
			}
		}
		else
		{
			result=false;
		}
		if(result==true)
		{
			System.out.println("arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}
	}
		public static void main (String args[])
		{
			int arr1[]= {2,10,3,4,5};
			int arr2[]= {2,10,3,4,5};
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			equal(arr1,arr2);
			
		}
}
