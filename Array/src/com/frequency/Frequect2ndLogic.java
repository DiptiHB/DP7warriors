package com.frequency;

import java.util.Arrays;

public class Frequect2ndLogic {
//static void frequency(int a[])
//{
//	int count;
//	boolean visited;
//	for(int i=0;i<a.length;i++)
//	{
//		count=1;
//		visited=false;
//		for(int j=i-1;j>=0;j--)
//		{
//			if(a[i]==a[j])
//			{
//				visited=true;
//				break;
//			}
//		}
//		if(visited==false)
//		{
//			for(int k=i+1;k<a.length;k++)
//			{
//				if(a[i]==a[k])
//				{
//					count++;
//				}
//			}
//			System.out.println(a[i]+" ---> "+count);
//		}
//	}
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,5,6,1,5,7};
		//frequency(arr);
		System.out.println(Arrays.toString(arr));
		int count;
		boolean visited;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			visited=false;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]==arr[j])
				{
					visited=true;
					break;
				}
			}
			if(visited==false)
			{
				for(int k=i+1;k<arr.length;k++)
				{
					if(arr[i]==arr[k])
					{
						count++;
					}
				}
				System.out.println(arr[i]+" ---> "+count);
			}
		}
	}

}
