package com.stringlogical;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoStrings {
	public static void mergeString(String s1,String s2)
	{
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		char merge[]=new char[a.length+b.length+1];
		int i=0;
		for(int j=0;j<a.length;j++)
		{
			merge[i]=a[j];
			i++;
			
		}
		merge[i]=' ';
		i++;
		
		for(int j=0;j<b.length;j++)
		{
			merge[i]=b[j];
			i++;
		}
		System.out.println("................after concatination............");
		
		String s=new String(merge);
		System.out.println(s);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word 1: ");
		String s1=sc.next();
		System.out.println("Enter any word 2: ");
		String s2=sc.next();
		
		 mergeString(s1,s2);
		
	}

}
