package com.arrylistlogical;

import java.util.*;

//18.WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
public class PrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=50;i++)
		{
			al.add(i);
		}
		System.out.println();
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			int n=itr.next();
			if(n%2==0)
			{
				System.out.print(n+" ");
			}
		}
		

	}
	

}
