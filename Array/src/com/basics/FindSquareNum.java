package com.basics;

import java.util.Arrays;

//WAP to display all square number in array. Means e.g. arr[] = [23, 43, 25, 49, 12, 
//9, 78, 66, 39, 0] so output is 25, 49, 9.

public class FindSquareNum {
	static void squareNum(int a[])
	{
		int i;
		for( i=0;i<a.length;i++)
		{
			for(int j=1;j<=a[i];j++)
			{
				if((j*j)==a[i])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23, 43, 25, 49, 12,9, 78, 66, 39, 0};
		squareNum(arr);

	}

}
