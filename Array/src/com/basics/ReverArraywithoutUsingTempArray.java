package com.basics;

import java.util.Arrays;

public class ReverArraywithoutUsingTempArray {
	static void reverseArray(int a[])
	{
		for (int i = 0; i < a.length/2-1; i++)
		{
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.println(a[i]);
//		}
		System.out.println("after reversing array--------------------------");
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 12, 7, 15, 8, 14, 10 };
		//  expected o/p : {10,14,8,15,7,12}
		System.out.println(Arrays.toString(arr));
		reverseArray(arr);
		

	}

}
