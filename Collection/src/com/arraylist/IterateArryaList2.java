package com.arraylist;

import java.util.ArrayList;
import java.util.*;

//create an arraylist of float and iterate.
public class IterateArryaList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Float> f1=new ArrayList<>();
		f1.add(15.0f);
		f1.add(55.08f);
		f1.add(74.5f);
		f1.add(26.9f);
		f1.add(98.2f);
		System.out.println(f1);//1st way
		
		System.out.println("------------2nd------------------");//2nd way
		for(int i=0;i<f1.size();i++)
		{
			System.out.println(f1.get(i));
		}
		
		System.out.println("------------3rd---------------");//3rd way using enhanced for loop
		for(Float f:f1)
		{
			System.out.println(f);
		}
		
		System.out.println("------------4th--------------");//4th way using iterator
		Iterator <Float> itr=f1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---------------5th-------------");//5th way using arraylist
		ListIterator <Float> lr=f1.listIterator();
		while(lr.hasNext())
		{
			System.out.println(lr.next());
		}
		
		System.out.println("----------------6th-----------");// 6th way from last element Arraylist
		ListIterator <Float>lr2= f1.listIterator(f1.size());
		while(lr2.hasPrevious())
		{
			System.out.println(lr2.previous());
		}

	}

}
