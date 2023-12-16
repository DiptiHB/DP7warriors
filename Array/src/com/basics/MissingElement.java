package com.basics;
//. Write a Java program to find a missing number in an array. Means e.g. array has 1 
//to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 
//5
public class MissingElement {
	public static int MissingNo(int a[], int n)
    {
        int sum = ((n+1)*(n+2))/2;// sum of n natural number formula ,calculated sum 
        for (int i = 0; i < n; i++)
        {
            sum -= a[i];
        }
        return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = { 1, 2, 3, 5, 6, 7, 8};
	        int n = arr.length;
	        System.out.println("missing number is: "+MissingNo(arr,n)); 
	}

}
