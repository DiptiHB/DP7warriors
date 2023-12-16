package com.treeset;

import java.util.Comparator;

import com.hashmap.*;

public class PriceComparatorBook implements Comparator<Book>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b2.getPrice()-b1.getPrice();
	}

}
