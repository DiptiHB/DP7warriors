package com.stringlogical;

public class RemoveDuplicateChar {
	static void removeDuplicate(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='\0')
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
				
			}
			System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello java";
		//o/p: helo jav
		
		removeDuplicate(s);

	}

}
