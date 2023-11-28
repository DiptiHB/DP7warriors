package com.stringlogical;

public class ReverseString {
	static void reverseString(String s)
	{
		String revStr="";
		for(int i=s.length()-1;i>=0;i--)
		{
			revStr=revStr+s.charAt(i);
		}
		System.out.println("After reversing-->"+revStr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i like to learn java";
		System.out.println("before reversing------------");
		System.out.println(s);
		reverseString(s);

	}

}
