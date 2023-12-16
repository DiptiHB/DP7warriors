package com.hashset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<>();
		hs.add("java");
		hs.add("HTML");
		System.out.println(hs.add("Ruby"));
		hs.add("CSS");
		hs.add("python");
		hs.add("go");
		//System.out.println(hs.add("Ruby"));
		System.out.println(hs);
		//System.out.println("--------------------iterating hashset---------------------------");
		System.out.println("--------------------------------------------");
		
		HashSet<String>hs2=new HashSet<>();
		hs2.add("java");
		hs2.add("CSS");
		hs2.add("c++");
		System.out.println(hs2);
		
		hs.addAll(hs2);
		System.out.println(hs);//union
		
		hs.removeAll(hs2);
		System.out.println(hs);//difference
		
		hs.retainAll(hs2);
		System.out.println(hs);//intersection
	}

}
