package com.stringlogical;

public class CharacterOccurence {
	static int Charoccurence(String s)
	{
		char occur='a';
		int count=0;
		int i;
		for( i=0;i<s.length();i++)
		{
			if(s.charAt(i)==occur)
			{
				count++;
			}
			if(count>1)
			{
				break;
			}
				
		}
		return i;		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java programming";
		System.out.println( "second time occurence of 'a' is: "+Charoccurence(s));

	}

}
