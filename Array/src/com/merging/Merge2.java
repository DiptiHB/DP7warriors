package com.merging;

import java.util.Arrays;

public class Merge2 {
	static int[] mergeArray(int a1[],int a2[])
	{
		int mar[]=new int[a1.length+a2.length];
		int index=0;
		int maxLength=Math.max(a1.length, a2.length);
		
		for(int j=0;j< maxLength;j++)
		{
			if(j<a1.length)
			{
				mar[index]=a1[j];
				index++;
			}
			if(j<a2.length)
			{
				mar[index]=a2[j];
				index++;
			}
			
		}
		
		return mar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr1[]= {1,2,3,4,5};
		  int arr2[]= {11,12,13};
		  int marge[]=mergeArray(arr1,arr2);
		  System.out.println("-----------after adding array elements alternately------");
		  System.out.println(Arrays.toString(marge));
	}

}
