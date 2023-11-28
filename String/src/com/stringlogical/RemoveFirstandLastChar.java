package com.stringlogical;

import java.util.Arrays;

public class RemoveFirstandLastChar {
	
	 static void removeChar(String s)
	 {
		char ch[]=s.toCharArray();
		for(int i=1;i<ch.length-1;i++)
		{
			System.out.print(""+ch[i]+"");
		} 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
		removeChar(s);
		
	}

}
