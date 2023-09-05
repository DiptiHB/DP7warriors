package com.alphabets;

public class PrintAbPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=(3-i);j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print("ab");
			}
			System.out.println();
		}

	}

}
