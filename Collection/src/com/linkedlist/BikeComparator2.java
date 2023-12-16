package com.linkedlist;

import java.util.Comparator;

public class BikeComparator2 implements Comparator<Bike> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Bike b1, Bike b2) {
		// TODO Auto-generated method stub
		if(b1.getPrice()==b2.getPrice())
			return b1.getName().compareTo(b2.getName());
		else
			if(b1.getPrice()>b2.getPrice())
				return -1;
			else
				return 1;
	}

}
