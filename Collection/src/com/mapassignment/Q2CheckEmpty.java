package com.mapassignment;

import java.util.HashMap;

public class Q2CheckEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<>();
		System.out.println("before: "+map.isEmpty());
		
		map.put(1, "sign of four");
	    map.put(2, "the hound of baskerville");
	    System.out.println("After: "+map.isEmpty());
	    
	}

}
