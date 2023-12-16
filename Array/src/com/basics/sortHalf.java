package com.basics;

import java.util.Scanner;

public class sortHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i,j,k,temp,mid;
		
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		mid=size/2;
		for (i = 0; i < mid; i++)
		{
            for (j = i+1; j < mid; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
		}
		
		
		for (i = mid; i < size; i++) 
        {
            for (j = i ; j < size; j++) 
            {
                if (arr[i] < arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		
		System.out.println("Sorted Arrays:");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		


	}

}
