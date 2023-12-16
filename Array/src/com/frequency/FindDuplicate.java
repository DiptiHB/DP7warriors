package com.frequency;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
	static void finfDuplicateElement(char a[])
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
	
			if(count>1)
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
        char arr[]=new char[size];
        
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println("enter elements: ");
        	arr[i]=sc.next().charAt(0);//accept a,b,c....z
        }
        System.out.println(Arrays.toString(arr));
        finfDuplicateElement(arr);

	}

}
