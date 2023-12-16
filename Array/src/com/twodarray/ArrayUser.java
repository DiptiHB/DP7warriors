package com.twodarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUser {
	static void printArray(int a[][],int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
				System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of row");
		int row=sc.nextInt();
		System.out.println("enter number of column");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) 
			{
			System.out.println("enter array elements:");
			arr[i][j]=sc.nextInt();
			}
		}
		
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<col;j++) 
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//		System.out.println("");
		//}
		printArray(arr, row, col);
		

	}

}
