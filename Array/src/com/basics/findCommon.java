package com.basics;
// Write a Java program to find the common elements between two arrays (int values) 
//Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 
//66, 22], so common between two arrays are 23 and 91


public class findCommon {
	static void commonElement(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(" "+a[i]);
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12, 23, 34, 67 ,78, 91, 56};
		int arr2[]= {39, 25, 15, 23, 55, 91,66, 22};
		commonElement(arr,arr2);
		
	}

}
