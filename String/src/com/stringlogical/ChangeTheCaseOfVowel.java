package com.stringlogical;

import java.util.Scanner;

//. Change the case of the vowels
public class ChangeTheCaseOfVowel {
	static void changeCase(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]-=32;
			}
			System.out.print(ch[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word: ");
		String s=sc.next();
		changeCase(s);
		
		

	}

}
