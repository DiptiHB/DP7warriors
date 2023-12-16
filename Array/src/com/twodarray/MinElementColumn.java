package com.twodarray;

public class MinElementColumn {
	static void minElementincol(int a[][])
	{
		for(int j=0;j<3;j++)
		{
			int min=Integer.MAX_VALUE;
			for(int i=0;i<2;i++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
			System.out.println("min in column: "+min);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{22,31,9},{12,25,16}};
		minElementincol(arr);

	}

}
