package com.basics;
import java.util.*;
public class AverageRainFall {
	
	static void averageFall(float a[],int n)
	{
		float sum=0;
		float average=0;
		for(int i=0;i<a.length;i++)	
		{
			sum+=a[i];
		}
		average=sum/a.length;
		System.out.println("average of rain fall: "+average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n=sc.nextInt();
		float arr[]=new float[n];
		for(int i=0;i<arr.length;i++)	
		{
			System.out.println("enter value: ");
			arr[i]=sc.nextFloat();
		}
		System.out.println(Arrays.toString(arr));
		averageFall(arr,n);
		

	}

}
