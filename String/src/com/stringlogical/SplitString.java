package com.stringlogical;

import java.util.Arrays;

//10.	WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HELLO$WORLD";
		String str[]=s.split("\\$");
		//System.out.println(Arrays.toString(str));
		System.out.print(str[0]+" "+str[1]);
		
		
		
		
		
	}

}
