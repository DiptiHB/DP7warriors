package com.mapassignment;

import java.util.HashMap;

//4.	WAP to search for an element from HashMap using key
public class Q4SearchKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "sign of four");
	    map.put(2, "the hound of baskerville");
	    map.put(3, "the empty house");
	    map.put(4, "the vallay of fear");
	    
	    System.out.println(map.containsValue("the empty house"));
	    
	}

}
