package com.stringlogical;

import java.util.Scanner;

public class replaceAllduplicate {
	public static String replace(String s)
	{
		
		
		for(int i=0;i<s.length();i++)
		{
		for(int j=i+1;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				s=s.replace(s.charAt(j), '$');
			}
		}
		System.out.println(s);
		
		}
		return s;
   
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word: ");
		String word=sc.next();
		System.out.println("original number: ");
		word=replace(word);
		System.out.println("new word: "+word);

	}

}
