package com.stringlogical;

import java.util.Arrays;

public class DevideInEqual {
	static void divideString(String s,int noOfCh)
	{
		int len=s.length();
		
		int n=len/noOfCh;
		
		String str[]=new String[n];
		
		int index=0;
		for(int i=0;i<len;i+=noOfCh)
		{
			str[index]=s.substring(i,i+noOfCh);
			index++;
		}	
		System.out.println(Arrays.toString(str));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"I","am","very","smart"};
		String s1=String.join("",arr);
		System.out.println(s1);
		
		int noOfchar=2;
		divideString(s1,noOfchar);

	}

}
