package com.linkedlist;

import java.util.LinkedList;

//11.	WAP to replace an element in a linked list.
public class ReplaceElement {

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
		lang.set(4, "English");
		System.out.println("After replacing: "+lang);

	}

}
