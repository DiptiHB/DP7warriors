package com.merging;

import java.util.Arrays;

public class MergeArray {
	static int[] merge(int a1[],int a2[])
	{
		int mar[]=new int[a1.length+a2.length];
		int i=0;
		for(int j=0;j<a1.length;j++)
		{
			mar[i]=a1[j];
			i++;
					
		}
		for(int j=0;j<a2.length;j++)
		{
			mar[i]=a2[j];
			i++;
					
		}
		return mar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9};
		int margeary[]=merge(arr1,arr2);
		 System.out.println("-----------after adding array elements------");
		System.out.println(Arrays.toString(margeary));

	}

}
