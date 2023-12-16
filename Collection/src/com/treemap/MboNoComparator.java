package com.treemap;

import java.util.Comparator;

public class MboNoComparator implements Comparator<Customer>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return (int) (c1.getmNo()-c2.getmNo());
	}

}
