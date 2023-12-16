package com.linkedlist;

import java.util.LinkedList;

//7.	WAP to check if a particular element exists in a linked list.
public class ElementPresentorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String>ldk=new LinkedList<>();
		ldk.add("Dipti");
		ldk.add("Abhi");
		ldk.add("ujawala");
		ldk.add("Harish");
		ldk.add("Sunita");
		ldk.add("Ram");
		System.out.println(ldk.contains("Sunita"));

	}

}
