package com.arrayrevision;

public class MaxNumInArray {
	public static void findMax(int arr[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}	
		}
		System.out.println("max number is: "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,4,55,45,32,2,6};
		findMax(arr);
	}

}
