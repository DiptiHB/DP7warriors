package com.string1;

public class PrintChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		char ch[]=s.toCharArray();
		
		System.out.println(ch);
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u')
			{
				ch[i]='$';	
			}
		}
		System.out.println(ch);
		
		String s1="hello";
		char ch1[]=s1.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]=='a'|| ch1[i]=='e' || ch1[i]=='i' ||ch1[i]=='o' ||ch1[i]=='u')
			{
				ch1[i]-=32;
			}
		}
		System.out.println(ch1);

	}

}
