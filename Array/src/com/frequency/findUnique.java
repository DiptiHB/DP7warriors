package com.frequency;

import java.util.Arrays;
import java.util.Scanner;

public class findUnique {
static void uniqueElement(int a[])
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]=='\0')
		{
			continue;
		}
		int count=1;
		for(int j=i+1;j<a.length;i++)
		{
			if(a[i]==a[j])
			{
				count++;
				a[j]='\0';
			}
		}
		if(count==0)
		{
			System.out.println(a[i]); 
		}
	}
	
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
        uniqueElement(arr);

	}

}
