package com.stringlogical;

import java.util.Scanner;

public class IsSortedAlphabetically {
	static void CheckSortAlphabet(String s)
	{
		boolean flag=true;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			
		  for(int j =i+1;j<ch.length;j++)
		  {
			 if(ch[i]>ch[j])
			 {
				flag=false;
			 }	  
		  } 
		}
		if(flag ==true)
		{
			System.out.println("given word is alphabetically sorted");
		}
		else
		{
			System.out.println("given word is not sorted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word: ");
		String s=sc.next();
		CheckSortAlphabet(s);
		

	}

}
