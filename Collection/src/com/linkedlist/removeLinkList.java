package com.linkedlist;

import java.util.LinkedList;

//4.	WAP to remove and return the first element of a linked list.
public class removeLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String>ldk=new LinkedList<>();
		ldk.add("Dipti");
		ldk.add("Abhi");
		ldk.add("ujawala");
		ldk.add("Harish");
		ldk.add("Sunita");
		ldk.add("Ram");
		
	    System.out.println(	"first element is: "+ldk.getFirst());
	    System.out.println(ldk.removeFirst());
	    System.out.println(ldk);
		

	}

}
