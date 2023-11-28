package com.stringlogical;

public class FindWordFrequency {
	static void findfrequency(String s)
	{
		String str[]=s.split("\\s");
		int count;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("visited"))
				continue;
			
			count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
				count++;
				str[j]="visited";
				}
			}
			System.out.println(str[i]+"---> "+count );
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a big cat roll on big mat";
		findfrequency(s);

	}

}
