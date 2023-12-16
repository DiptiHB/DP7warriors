package com.mapassignment;

import java.util.HashMap;

//5.	WAP to test if a HashMap contains a mapping for the specified value
public class Q5containsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<>();
	    map.put(1, "Snow White");
	    map.put(2, "Peparina");
	    map.put(3, "Prince");
	    map.put(4, "Slipendrella");
	    map.put(5, "Clindrella");
	    System.out.println(map.containsValue("Prince"));
	}

}
