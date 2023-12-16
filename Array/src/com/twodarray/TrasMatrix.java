package com.twodarray;

public class TrasMatrix {
	static void trasporseofMatrix(int a[][])
	{
		
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<2;i++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6}};
		trasporseofMatrix(arr);
		

	}

}
