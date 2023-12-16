package com.basics;

import java.util.Arrays;

public class CheckEqualArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,10,3,4,5};
		int arr2[]= {2,10,3,4,5};
		boolean ans=Arrays.equals(arr, arr2);
		if(ans==true)
		{
			System.out.println("arrays are equal.");
		}
		else
		{
			System.out.println("arrays are not equal");
		}
	}

}
