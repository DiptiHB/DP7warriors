package com.arrylistlogical;

import java.util.ArrayList;

//17.WAP to insert an element into the ArrayList at the first position
public class SetElementAtFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(5);
		al.add(111);
		al.add(45);
		System.out.println("before: "+al);
		
		al.set(0, 777);
		System.out.println("after: "+al);

	}

}
