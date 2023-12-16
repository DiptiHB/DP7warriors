package com.twodarray;

public class MinRowElements {
	static void minElementinRow(int a[][])
	{
		for(int i=0;i<2;i++)
		{
			int min=Integer.MAX_VALUE;
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
			System.out.println("min: "+min);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{22,31,9},{12,25,16}};
		minElementinRow(arr);

	}

}
