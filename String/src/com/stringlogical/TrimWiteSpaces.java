package com.stringlogical;
//12.	Write a Java program to trim leading white space characters in a string.
public class TrimWiteSpaces {
	static void trimSpaces(String s)
	{
		s=s.trim();
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="   japanese is interesting language to learn";
		System.out.println("before: ");
		System.out.println(s);
		System.out.println("after:");
		trimSpaces(s);
	}

}
