package com.arrylistlogical;

import java.util.ArrayList;

//14.	WAP to increase the size of an ArrayList
public class IncreaseSizeofArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(2);
		al.add(12);
		al.add(3);
		al.add(4);
		al.add(45);
		al.add(65);
		al.add(13);
		al.add(22);
		al.add(42);
		System.out.println(al);
		System.out.println("Previous: "+al.size());
		al.add(32);
		al.add(72);
		System.out.println(al);
		System.out.println("After: "+al.size());
		
		

	}

}
