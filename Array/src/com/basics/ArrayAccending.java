package com.basics;

import java.util.Arrays;

public class ArrayAccending {
static void bubbleSort(int a[])
{
	for (int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
			//swaping
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,9,12,4,1,5};
		 System.out.println(Arrays.toString(arr));
		 bubbleSort(arr);
		 System.out.println("sorted array: "+Arrays.toString(arr));
	}

}
