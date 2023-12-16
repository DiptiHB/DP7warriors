package com.logicalprogram;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			if(i%9==0)
			{
				System.out.print("hello"+" ");
			}
			else if(i%3==0)
			{
				System.out.print("Hi"+" ");
			}
			else
			{
				System.out.print(i+" ");
			}
		}

	}

}
