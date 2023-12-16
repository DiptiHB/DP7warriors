package com.arrylistlogical;

import java.util.ArrayList;

public class SearchSpecifiedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1=new ArrayList<>();
		l1.add("Dipti");
		l1.add("Anjali");
		l1.add("Jeet");
		l1.add("Abhi");
		l1.add("Abhishek");
		ArrayList<String> l2=new ArrayList<>();
		l2.add("Dipti");
		l2.add("Jeet");
	    System.out.println( l1.containsAll(l2));
		

	}

}
