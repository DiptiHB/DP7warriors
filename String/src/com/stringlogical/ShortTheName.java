package com.stringlogical;

import java.util.Scanner;

public class ShortTheName {
	static void shortName(String s)
	{
		String str[]=s.split("\\s");
		String result=" ";
		for(int i=0;i<str.length;i++)
		{
		 if(i<str.length-1)
		 {
			result= str[i].charAt(0)+".";
		 }
		 else
		 {
			 result=str[i].charAt(0)+str[i].substring(1);
		 }
		  System.out.print(result);
		
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the full name: (first name+middle name+last name)");
		String name=sc.nextLine();
		
		shortName(name);
	}

}
