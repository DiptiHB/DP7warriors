package com.hashmap;

import java.util.*;

public class BookAuthorHashMap {
	static void createMap(ArrayList<Book>bl)
	{
		HashMap<Author,Integer> h1=new HashMap<>();
		for(Book b:bl)
		{
			if(h1.containsKey(b.getAuthor()))
			{
				h1.put(b.getAuthor(),h1.get(b)+1);
			}
			else
			{
				h1.put(b.getAuthor(), 1);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book>bl=new ArrayList<>();
		bl.add(new Book(1,"Secret seven",550,new Author(1,"enid Bliton")));
		bl.add(new Book(2,"Harry Potter",590,new Author(2,"jk Rowling")));
		bl.add(new Book(3,"king lear",780,new Author(3,"willam shekspear")));
		bl.add(new Book(4,"sherlock homes Adventures",1200,new Author(4,"S.A Conon doyal")));
		bl.add(new Book(5,"Secret seven and adventure",550,new Author(1,"enid Bliton")));
		bl.add(new Book(6,"sherlock homes Returns",1400,new Author(4,"S.A Conon doyal")));
		bl.add(new Book(7,"Harry potter and dealthy hollows",1350,new Author(2,"jk rowling")));
		bl.add(new Book(8,"twelf night",780,new Author(3,"willam shekspear")));
		

	}

}
