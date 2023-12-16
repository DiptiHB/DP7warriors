package com.basics;

import java.util.Arrays;

public class MaxNumArray {
  static void maxElement(int a[])
  {
	  int max=a[0];
	  for(int i=0;i<a.length;i++)
	  {
		 
		 if(a[i]>max)
		 {
			 max=a[i];
			 
		 }
	  }
	  System.out.println("maximum number is: "+max);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,4,3,8,9,1,7};
		System.out.println(Arrays.toString(arr));
		maxElement(arr);
	}

}
