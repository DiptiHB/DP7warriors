package com.twodarray;

public class MaxElementInColumn {
	static void maxElementincol(int a[][])
	{
		for(int j=0;j<3;j++)
		{
			int max=Integer.MIN_VALUE;
			for(int i=0;i<2;i++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.println("max in column: "+max);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{22,31,9},{12,25,16}};
		maxElementincol(arr);
		

	}

}
