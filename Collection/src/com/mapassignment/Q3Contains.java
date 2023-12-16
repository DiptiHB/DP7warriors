package com.mapassignment;

import java.util.HashMap;

//3.	WAP to test if a HashMap contains a mapping for the specified key
public class Q3Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<>();
	    map.put(1, "as you like it");
	    map.put(2, "twelth night");
	    map.put(3, "Athello");
	    map.put(4, "king lear");
	    map.put(5, "All well the ends well");
	    
	   System.out.println( map.containsKey(3));
	   System.out.println(map.containsValue("king lear"));

	}

}
