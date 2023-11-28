package com.stringlogical;

public class MaxFrequencyWord {
	static void findMaxfreq(String s)
	{
		String str[]=s.split("\\s");
		int count;
		int max=Integer.MIN_VALUE;
		String word=" ";
		
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
			
			if(count>max)
			{
				max=count;
				word=str[i];
			}
		}
		System.out.println("the most repeated word is: "+word);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love India because India is my country and India country is great";
		findMaxfreq(s);
	}

}
