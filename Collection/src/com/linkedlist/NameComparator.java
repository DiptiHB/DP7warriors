package com.linkedlist;
import java.util.*;
public class NameComparator implements Comparator<Book> {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Book b1, Book b2) {
		return b1.getName().compareTo(b2.getName());
	}

}
