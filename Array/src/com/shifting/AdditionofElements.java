package com.shifting;

public class AdditionofElements {
	static void getSumofIndex(int a[])
	{
		int sum=0;
		
		for(int i=0;i<a.length/2;i++)
		{
			sum=a[i]+a[a.length-i-1];
			
			System.out.println("sum: "+sum);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,5,9,1,6};
		 getSumofIndex(arr);
		
	}

}
