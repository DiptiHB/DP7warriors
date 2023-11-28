package com.stringlogical;

public class MiddleWordRev {
	static void reverseMiddleWord(String s)
	{
		String str[]=s.split("\\s");
		String rev="";
		rev=rev+str[0]+" ";
		 for(int i=1;i<str.length-1;i++)
		 {
			 for(int j=str[i].length()-1;j>=0;j--)
			{
				rev=rev+str[i].charAt(j);
			}
			rev=rev+" ";
		}
		 rev=rev+str[str.length-1];
		 System.out.println("after reversing: "+rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i like to learn java";
		System.out.println("before reversing------------");
		System.out.println(s);
		reverseMiddleWord(s);

	}

}
