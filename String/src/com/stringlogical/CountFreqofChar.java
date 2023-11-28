package com.stringlogical;
// Count frequency of characters
import java.util.Scanner;

public class CountFreqofChar {
	static void checkFrequency(String s)
	{
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='\0')
			{
				continue;
			}
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			System.out.println(ch[i]+" ----> "+count);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word: ");
		String s=sc.next();
		checkFrequency(s);

	}

}
