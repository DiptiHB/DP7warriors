package com.stringlogical;

public class FindUniqueString {
	static void findUnique(String str1[],String str2[])
	{
		boolean found;
		for(String s:str2)
		{
			found=false;
			for(String si:str1)
			{
				if(s.equals(si))
				{
					found=true;
					break;
				}
			}
			if(!found)
				System.out.println(s);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[]= {"neha","dipti","pralay","shivani","madhu"};
		String s2[]= {"pratiksha","dipti","shivani","anuj","aniket"};
		
		findUnique(s1,s2);
	}

}
