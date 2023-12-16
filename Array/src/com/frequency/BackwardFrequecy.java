package com.frequency;

import java.util.Arrays;
import java.util.Scanner;

public class BackwardFrequecy {
	static void backFrequency(int a[])
	{
		boolean status;
		int count;
		int num=0;
		int maxCount=0;
		for(int i=0;i<a.length;i++)
		{
			
			 count=1;
			 status=false;
			for(int j=i-1;j>=0;j--)
			{
				if(a[i]==a[j])
				{
					status=true;
					break;
				}		
			}
			if(status==false)
			{
				for(int k=i+1;k<a.length;k++)
				{
					if(a[i]==a[k])
					{
						count++;
					}
				}
				System.out.println(a[i]+"--->"+count);
			}
			if(count>maxCount)
			{
				maxCount=count;
				num=a[i];
			}
		}
		System.out.println("max frequency of "+num+"--->"+maxCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        backFrequency(arr);

	}

}
