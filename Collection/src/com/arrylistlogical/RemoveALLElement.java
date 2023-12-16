package com.arrylistlogical;

import java.util.ArrayList;

//8.	WAP to remove all element from ArrayList
public class RemoveALLElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("Dipti");
		al.add("abhi");
		al.add("priya");
		al.add("Dipti");
		al.add("abhi");
		al.add("Dipti");
		al.add("priya");
		al.add("jeet");
		al.add("omkar");
		System.out.println(al);
		al.removeAll(al);
		System.out.println("After removing all element, is it empty?");
		System.out.println(al.isEmpty());

	}

}
