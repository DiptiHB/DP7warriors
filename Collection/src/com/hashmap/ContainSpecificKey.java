package com.hashmap;
//3.	WAP to test if a HashMap contains a mapping for the specified key
import java.util.*;
public class ContainSpecificKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String>h1=new HashMap<>();
		h1.put(1, "Dipti");
		h1.put(2, "Anamika");
		h1.put(3, "mrunal");
		h1.put(4, "pratik");
		h1.put(5, "Chitra");
		System.out.println(h1.containsKey(4));
	}

}
