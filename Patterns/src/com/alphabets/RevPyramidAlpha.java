package com.alphabets;

public class RevPyramidAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i=5;i>=1;i--)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print(" ");
			}
			char ch='A';
			for(char j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	

	}

}
