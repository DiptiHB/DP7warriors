package com.stringrevision;

import java.util.Arrays;

public class Speratarray {
	public static void converintotArray(String s)
	{
		int sum=0;
		char ch[]=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		char arr[]=new char[ch.length];
		int arr2[]=new int[ch.length];
//		int count=0;
//		int count1=0;
		int k=0,i;
		for( i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				arr[k++]=ch[i];
			}
		}
		k=0;
		for( i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i])) 
			{
				arr2[k++]=ch[i];
			    sum=sum+Character.getNumericValue(ch[i]);
				
			}
		}
		System.out.println("sum= "+sum);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc3r56p";
		converintotArray(s);
	}

}
