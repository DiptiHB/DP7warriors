package com.advance;

import java.util.Arrays;

public class seconfhighwoutsort {
	static void secondHighElement(int arr[])
	{
		int high=Integer.MIN_VALUE;
		int secondhigh=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>high)
			{
				secondhigh=high;
				high=arr[i];
			}
			else if(arr[i]>secondhigh)
			{
				secondhigh=arr[i];	
			}
		}
		System.out.println("second highest number is: "+secondhigh);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,7,10,3,4,9,5};
		System.out.println(Arrays.toString(arr));
		secondHighElement(arr);
		

	}

}
