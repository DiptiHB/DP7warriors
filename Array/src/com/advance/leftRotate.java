package com.advance;

import java.util.Arrays;

public class leftRotate {
	static void leftrotate(int a[])
	{
		int firstElement=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];	
		}
		a[a.length-1]=firstElement;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,2,5,6,4};
		System.out.println("--------before rotation-------");
		System.out.println(Arrays.toString(arr));
		int n=3;
	    for(int i=0;i<=3;i++)
		{
	    	leftrotate(arr);		
		}
	    System.out.println("----------After roration-----------");
	    System.out.println(Arrays.toString(arr));
	}
}
