package com.basics;

import java.util.Arrays;

public class ReverArrayElements {
	static void reverse(int a[], int n)
    {
		System.out.println("----------Reversed array-------------------");
        int arr2[] = new int[n];
        int size=n;
        for (int i=0;i<n;i++) 
        {
            arr2[size-1]=a[i];
            size=size-1;
        }
        for (int j = 0; j < n; j++) 
        {
           System.out.print(" "+arr2[j]);
        }
        System.out.println("\n"+Arrays.toString(arr2));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {12,7,15,8,14,10};
		 System.out.println(Arrays.toString(arr));
		 int n=arr.length;
		 reverse(arr,n);
		 
		 
		 
		 
	}
}
