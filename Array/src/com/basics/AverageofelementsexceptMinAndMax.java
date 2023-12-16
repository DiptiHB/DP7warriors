package com.basics;
//WAP to calculate average of all elements in an Array except max and min element 
//(Means don’t include the highest and lowest number of your array in your average). 

public class AverageofelementsexceptMinAndMax {
	
	public static void average(int a[])
	{
		int i,average=0;
		int max=a[0];
		int min=a[0];
		int ans=0;
		for(i=0;i<a.length;i++)
		{
		  if(a[i]>max)
		  {
			  max=a[i];
		  }
		  if(a[i]<min)
		  {
			  a[i]=min;
		  }
		  int diff=max+min;//9
		   average+=a[i];
		  ans=average-diff;
		}
		System.out.println("average: "+ans);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,7,8,3,6};
		average(arr);

	}

}
