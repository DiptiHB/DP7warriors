package com.stringlogical;

public class FindDuplicateWord {
	static void findwordDuplicate(String s)
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
				if(str[i]==str[j])
				{
					count++;
					str[j]="visited";
				}
			}
			if(count>1)
			{
				System.out.println(str[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="i love India because India is my country and India country is great";
        findwordDuplicate(s);
        
	}

}
