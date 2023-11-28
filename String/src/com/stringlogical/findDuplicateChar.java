package com.stringlogical;

import java.util.Scanner;

//Duplicate characters(Print and count) 

public class findDuplicateChar {
	public static void findDuplicate(String s)
	{
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='\0')
				continue;
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			if(count>1)
			{
				System.out.println(ch[i]+"-->"+count);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word: ");
		String s=sc.next();
		findDuplicate(s);

	}

}
