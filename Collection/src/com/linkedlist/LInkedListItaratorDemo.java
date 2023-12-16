package com.linkedlist;
import java.util.*;
public class LInkedListItaratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lk=new LinkedList<>();
		lk.add("yellow");
		lk.add("white");
		lk.add("blue");
		lk.add("purple");
		lk.add("grey");
		System.out.println(lk);
		System.out.println("----------------2nd way---------------------------------");
		for(int i=0;i<lk.size();i++)
		{
			System.out.println(lk.get(i));
		}
		System.out.println("----------------3rd way---------------------------------");
		for(String s:lk)
		{
			System.out.println(s);
		}
		System.out.println("----------------4th way---------------------------------");
		Iterator <String>itr=lk.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------5th way---------------------------------");
		ListIterator<String> litr=lk.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("----------------6th way---------------------------------");
		
		ListIterator<String> litr2=lk.listIterator(lk.size());
		while(litr2.hasPrevious())
		{
			System.out.println(litr2.previous());
		}
		System.out.println("----------------7th way---------------------------------");
		Iterator<String>itr2=lk.descendingIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}

}
