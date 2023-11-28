package com.stringlogical;

import java.util.Scanner;

public class StringPalindrom {
	static void checkPalindrom(String s)
	{
		boolean status=false;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			status=false;
			for(int j=ch.length-1-i;j>=0;j--)
			{
				if(ch[i]==ch[j])
				{
					status=true;
				}
			}
		}
		if(status==true)
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word: ");
		String s=sc.next();
		checkPalindrom(s);
	}

}
