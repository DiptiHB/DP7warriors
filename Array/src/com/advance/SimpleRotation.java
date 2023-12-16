package com.advance;

import java.util.Arrays;

public class SimpleRotation {
	static void rotate(int a[])
	{
		int lastElement=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];	
		}
		a[0]=lastElement;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,2,5,6,4};
		System.out.println("--------before rotation-------");
		System.out.println(Arrays.toString(arr));
		int n=3;
	    for(int i=0;i<=3;i++)
		{
	    	rotate(arr);		
		}
	    System.out.println("----------After roration-----------");
	    System.out.println(Arrays.toString(arr));
	}
// this is right rorate
	//do left rotate.
}
