package com.frequency;

import java.util.Arrays;
import java.util.Scanner;

public class FreqOfElements {
	static void frequency(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='\0')
			{
			continue;	
			}
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				count++;
				a[j]='\0';
				}
			}
			System.out.println(a[i]+" ----> "+count);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {2,3,5,8,2,3,4,6,8};
//		frequency(arr);
		Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println("enter elements: ");
        	arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        frequency(arr);
	}

}
