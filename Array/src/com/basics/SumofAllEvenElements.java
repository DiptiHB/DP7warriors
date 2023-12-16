package com.basics;
//***********sum of all even elements****************
import java.util.Arrays;

public class SumofAllEvenElements {
 static void sumElement(int a[])
 {
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			sum+=a[i];
		}
	}
	 System.out.println("sum of even elements: "+sum);
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,6,8};
		System.out.println(Arrays.toString(arr));
		sumElement(arr);
		
		
	}

}
