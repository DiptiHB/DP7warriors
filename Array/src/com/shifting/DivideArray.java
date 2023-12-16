package com.shifting;

import java.util.Arrays;

public class DivideArray {
	public static void divideArr(int a[])
	{
		int b[]=new int[a.length/2];
		int c[]=new int [a.length-b.length];
		System.out.println("length: "+b.length);
		
		for(int i=0;i<a.length;i++)
		{
			
			if(i<b.length)
			{
				b[i]=a[i];
				for(int j=i;j<b.length;j++)
				{
					for(int k=j+1;k<b.length;k++)
					{
						if(b[j]>b[k])
						{
							int temp=b[j];
							b[j]=b[k];
							b[k]=temp;
						}
					}
				}
			}
		}
			System.out.println(Arrays.toString(b));
//			else
//			{
//				c[i-b.length]=a[i];
//				for(int j=0;j<c.length;j++)
//				{
//					for(int k=j+1;k<c.length;k++)
//					{
//					if(c[j]<c[k])
//						{
//							int temp=c[j];
//							c[j]=c[k];
//							c[k]=temp;
//						}
//					}
//			     }
//		     }
	     
		//System.out.println(Arrays.toString(b));
		//System.out.println(Arrays.toString(c));
	}		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,4,3,1,8,9};
		divideArr(arr1);
	}

}
