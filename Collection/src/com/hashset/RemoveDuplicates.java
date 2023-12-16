package com.hashset;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();

		al.add("java");		
		al.add("c++");
		al.add("python");
		al.add("ruby");
		al.add("java");
		al.add("python");
		al.add("HTML");
		System.out.println(al);
		
		HashSet<String>hs=new HashSet<>(al);
		System.out.println(hs);
		
		
		
		
	}

}
