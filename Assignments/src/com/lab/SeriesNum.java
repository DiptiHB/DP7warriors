package com.lab;

public class SeriesNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		System.out.println("*********series************");
		for(int i=1;i<=n;i++)
		{
			int term=i*i+i*i*i;
			System.out.print(term);
			if(i<n)
			{
				System.out.print(",");
			}
		}

	}

}
