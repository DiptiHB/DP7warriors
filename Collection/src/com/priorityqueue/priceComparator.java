package com.priorityqueue;

import java.util.Comparator;

public class priceComparator implements Comparator<Book> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Book b1, Book b2) {
		if(b1.getPrice()==b2.getPrice());
		{
			return b1.getName().compareTo(b2.getName());
		}
	}

}
