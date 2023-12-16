package com.linkedlist;

import java.util.LinkedList;

//6.	WAP to retrieve but does not remove, the last element of a linked list.
public class RetriveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String>lang=new LinkedList<>();
		lang.add("japanese");
		lang.add("chinese");
		lang.add("korean");
		lang.add("Hindi");
		lang.add("french");
		lang.add("german");
		System.out.println(lang);
		
		System.out.println(lang.getFirst());
		System.out.println(lang.getLast());
		System.out.println(lang.get(2));
		

	}

}
