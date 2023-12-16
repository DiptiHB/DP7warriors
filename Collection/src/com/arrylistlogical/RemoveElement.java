package com.arrylistlogical;

import java.util.ArrayList;

//16.	WAP to remove the third element from an ArrayList
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(8);
		al.add(5);
		al.add(7);
		al.add(6);
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);

	}

}
