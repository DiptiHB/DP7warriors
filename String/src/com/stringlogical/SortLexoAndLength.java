package com.stringlogical;

import java.util.Arrays;

public class SortLexoAndLength {
	static void sortArray(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					if(s[i].length()==s[j].length())
					{
						String temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				}
				else if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		
		}
		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"java","devops","html","python","ruby"};
		System.out.println("befor sorting.............");
		System.out.println(Arrays.toString(arr));
		System.out.println("after sorting array...........");
		sortArray(arr);
	}

}
