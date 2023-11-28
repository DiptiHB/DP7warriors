package com.stringlogical;

public class ReverseWordByWord {
	static void reverseByWord(String s)
	{
		String str[]=s.split("\\s");
		String rev="";
		 for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				rev=rev+str[i].charAt(j);
			}
			rev=rev+" ";
		}
		 System.out.println("after reversing: "+rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i like to learn java";
		System.out.println("before reversing------------");
		System.out.println(s);
		reverseByWord(s);

	}

}
