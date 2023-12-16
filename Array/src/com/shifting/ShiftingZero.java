package com.shifting;

import java.util.Arrays;

public class ShiftingZero {
	static void shiftZerotoFirst(int a[])
	{
		int count=0;
		int temp;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				temp=a[i];
				a[i]=a[count];
				a[count]=temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,12,0,6};
        System.out.println(Arrays.toString(arr));
        System.out.println("---------after shifting negative elements to first---------");
        shiftZerotoFirst(arr);
	}

}
