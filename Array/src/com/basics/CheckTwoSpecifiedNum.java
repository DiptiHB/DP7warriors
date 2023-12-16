package com.basics;
//WAP to check if an array of integers contains two specified elements 65 and 77.
public class CheckTwoSpecifiedNum {
	public static void findNum(int a[])
	{
		boolean status=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==65)
			{
				status=true;
			}
			else if(a[i]==77)
			{
				status=true;
			}
			else
				status=false;
		}
		if(status==true)
		{
			System.out.println("given numbers are presents..!");
		}
		else 
		{
			System.out.println("SORRY !given numbers are not present.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,35,65,45,68,98,77};
		findNum(arr);

	}

}
