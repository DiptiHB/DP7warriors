package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleOf3and6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner (System.in);
		 int arr[]= {3,5,12,30,8,15};
		 System.out.println(Arrays.toString(arr));
		 int sum=0;
		 for(int i:arr)
			{
				if(i%3==0 && i%5==0)
				{
					System.out.println(i);
					sum+=i;
				}
			}
		 System.out.println("sum: "+sum); 
	}

}
