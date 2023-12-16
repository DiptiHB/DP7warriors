package com.vector;

import java.util.*;

public class IteratingVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> v=new Vector<>();
		v.add(12);
		v.add(3);
		v.add(4);
		v.add(8);
		v.add(null);
		v.add(null);
		v.add(-30);
		v.add(10);
		//1st way
		System.out.println(v);
		System.out.println("-----------2nd way-----------------");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("------------3rd way----------------");
		for(Integer i:v)
		{
			System.out.println(i);
		}
		System.out.println("------------4rd way----------------");
		Iterator<Integer>itr=v.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
	    System.out.println("------------5th way----------------");
		ListIterator<Integer>litr=v.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("------------6th way----------------");
		ListIterator<Integer>litr2=v.listIterator(v.size());
		while(litr2.hasPrevious())
		{
			System.out.println(litr2.previous());
		}
		System.out.println("------------7th way----------------");
		Enumeration<Integer> en=v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
