package com.stringlogical;

import java.util.Arrays;

// asked in accenture technical round
public class FirstLetterCapital {
	static void makeFirstLetterCapital(String s)
	{
		String str[]=s.split("\\s");
		System.out.println(Arrays.toString(str));
		String str2="";
		
		for(int i=0;i<str.length;i++)
		{
			char ch[]=str[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				if(j==0)
				{
					ch[j]=(char) (ch[j]-32);
				}
				
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india is beautiful country";
		makeFirstLetterCapital(s);
		

	}

}
