package com.linkedlist;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		if(b1.getPrice()==b2.getPrice());
		{
			return b1.getName().compareTo(b2.getName());
		}
	}

}
