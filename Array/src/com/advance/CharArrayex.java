package com.advance;

import java.util.Arrays;

public class CharArrayex {
	static void ConvertChar(char a[])
	{
		char i;
		for( i=0;i<a.length;i++)
		{
			if(a[i]<121)
			{
			a[i]+=2;
			}
			else if(a[i]>120 && a[i]<123)
			{
				a[i]-=24;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a','b','c','y','z'};
		System.out.println(Arrays.toString(arr));
		System.out.println("After changing.................");
		ConvertChar(arr);
	}

}
