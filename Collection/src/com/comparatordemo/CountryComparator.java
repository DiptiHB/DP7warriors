package com.comparatordemo;

import java.util.Comparator;

public class CountryComparator implements Comparator<Employee>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getCountry().compareTo(e2.getCountry());
	}

}
