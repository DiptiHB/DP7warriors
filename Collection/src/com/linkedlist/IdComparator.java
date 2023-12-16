package com.linkedlist;

import java.util.Comparator;

public class IdComparator implements Comparator<Book>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.getId()-b2.getId();
	}

}
