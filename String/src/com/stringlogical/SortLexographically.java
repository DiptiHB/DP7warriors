package com.stringlogical;

import java.util.Arrays;

public class SortLexographically {
	static void sortlexo(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
//		System.out.println("sorting length wise: ");
//		for(int i=0;i<s.length;i++)
//		{
//			for(int j=i+1;j<s.length;j++)
//			{
//				if(s[i].length()>s[j].length())
//				{
//					String temp=s[i];
//					s[i]=s[j];
//					s[j]=temp;
//				}
//			}
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"java","c","angular","python","c++"};
		System.out.println("befor sorting.............");
		System.out.println(Arrays.toString(arr));
		System.out.println("after sorting.............");
		sortlexo(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
