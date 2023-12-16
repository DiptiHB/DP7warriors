package com.mapassignment;

import java.util.HashMap;

//6.	WAP to remove an element from HashMap using key
public class Q6RemoveElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<>();
	    map.put(1, "as you like it");
	    map.put(2, "twelth night");
	    map.put(3, "Athello");
	    map.put(4, "king lear");
	    map.put(5, "All well the ends well");
	    
	    map.remove(3);
        System.out.println(map);
	   

	}

}
