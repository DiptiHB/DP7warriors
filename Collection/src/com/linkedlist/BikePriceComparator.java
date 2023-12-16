package com.linkedlist;

import java.util.Comparator;

public class BikePriceComparator implements Comparator<Bike> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Bike b1, Bike b2) {
		// TODO Auto-generated method stub
		return b1.getPrice()-b2.getPrice();
	}

}
