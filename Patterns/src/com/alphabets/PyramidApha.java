package com.alphabets;

public class PyramidApha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print(" ");
			}
			String s="ab";
			for(char j=1;j<=i;j++)
			{
				System.out.print(s);
				
			}
			System.out.println();
		}


	}

}
