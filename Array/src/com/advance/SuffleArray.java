package com.advance;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,2,4,15,25,30,41,3};
		Random r=new Random();
		int i,temp=0;
		
		int j=r.nextInt(arr.length);
		
		for( i=0;i<arr.length;i++)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
