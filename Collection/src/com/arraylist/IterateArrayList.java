package com.arraylist;

import java.util.*;


public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>a1=new ArrayList<>();
		a1.add("mango");
		a1.add("Orange");
		a1.add("kiwi");
		a1.add("pineapple");
		a1.add("cherry");
		System.out.println(a1);//1st way
		System.out.println("------------------------------");//2nd way
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("---------------------------");//3rd way using enhanced for loop
		for(String s:a1)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------");//4th way using iterator
		Iterator <String> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------");//5th way using listIterator
		ListIterator <String>litr=a1.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("--------------------------------------");//6th way iterating from last
		ListIterator <String>litr2=a1.listIterator(a1.size());
		while(litr2.hasPrevious())
		{
			System.out.println(litr2.previous());
		}
	}

}
