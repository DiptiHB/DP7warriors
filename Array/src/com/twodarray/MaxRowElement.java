package com.twodarray;
//WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
//output is: 31 and 25. 

public class MaxRowElement {
	static void maxElementinRow(int a[][])
	{
		for(int i=0;i<2;i++)
		{
			int max=Integer.MIN_VALUE;
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.println("max: "+max);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{22,31,9},{12,25,16}};
		maxElementinRow(arr);
		

	}

}
