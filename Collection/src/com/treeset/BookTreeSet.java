package com.treeset;
import java.util.*;

public class BookTreeSet {
	public static void sortTree(HashSet<Book>hs)
	{
		TreeSet<Book> ts=new TreeSet<>(new PriceComparatorBook());
		ts.addAll(hs);
		System.out.println(ts);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book>hs=new HashSet<>();
		hs.add(new Book(1,"king lear",1200));
		hs.add(new Book(2,"harry potter",1500));
		hs.add(new Book(3,"twelth night",500)); 
		hs.add(new Book(4,"as you like it",1200)); 
		hs.add(new Book(5,"cursed child",800)); 
		hs.add(new Book(6,"sign of four",550));
		sortTree(hs);
		

	}

}
