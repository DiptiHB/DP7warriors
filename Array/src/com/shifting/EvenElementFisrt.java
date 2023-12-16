package com.shifting;

import java.util.Arrays;

public class EvenElementFisrt {
	static void EvenNumFirst(int a[])
	{
		int count=0;
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
				if(a[i]%2==0)
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
		int arr1[]= {2,4,3,6,8,33};
		System.out.println(Arrays.toString(arr1));
		System.out.println("------------after shifting even numbers----------");
		EvenNumFirst(arr1);
	}

}
