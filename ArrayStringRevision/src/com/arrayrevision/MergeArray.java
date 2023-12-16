package com.arrayrevision;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int arr2[]= {11,22,33};
		int arr3[]= new int[arr.length+arr2.length];
		int i,k,j;
		for( i=0;i<arr.length;i++)
		{
			arr3[i]=arr[i];
		}
         k=i;
        for(j=0;j<arr2.length;j++)
        {
        	arr3[k]=arr2[j];
        	k++;
        }
        System.out.println(Arrays.toString(arr3));
	}

}
