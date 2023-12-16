package com.basics;

import java.util.Arrays;

public class MinNumArray {
	static void minElement(int a[])
	  {
		  int min=a[0];
		  for(int i=0;i<a.length;i++)
		  {
			 
			 if(a[i]<min)
			 {
				 min=a[i];
				 
			 }
		  }
		  System.out.println("maximum number is: "+min);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,4,3,8,9,1,7};
		System.out.println(Arrays.toString(arr));
		minElement(arr);
		

	}

}
