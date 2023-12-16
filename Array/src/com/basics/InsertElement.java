package com.basics;
import java.util.*;
public class InsertElement {
static void insert(int a[],int n,int pos)
{
	for(int j=a.length-1;j>pos;j--)
	{
		a[j]=a[j-1];
	}
	    a[pos]=n;
	System.out.println(Arrays.toString(a));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elements: ");
        for(int i=0;i<arr.length-1;i++)
        {
        	arr[i]=sc.nextInt();
        }
       
        System.out.println(Arrays.toString(arr));
        System.out.println("enter number: ");
        int n=sc.nextInt();
        System.out.println("which position you want to insert: ");
        int p=sc.nextInt();
        insert(arr,n,p);

	}

}
