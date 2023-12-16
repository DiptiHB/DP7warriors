package com.basics;
//8. WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9,
//0, 2, 4] 
import java.util.Arrays;

public class SwapArray {
	static void swap(int a[])
	{
		int temp,i,mid;
		mid=a.length/2;
		for(i=0;i<mid;i++)
		{
			temp=a[i];
			a[i]=a[i+2];
			a[i+2]=temp;
		}
		System.out.println("........After swapping Array........");
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 4, 9, 0};
		System.out.println("--------before-------");
		System.out.println(Arrays.toString(arr));
		swap(arr);

	}

}
