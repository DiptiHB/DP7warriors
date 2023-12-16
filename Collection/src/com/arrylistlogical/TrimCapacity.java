package com.arrylistlogical;

import java.util.ArrayList;

public class TrimCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(2);
		al.add(5);
		al.add(8);
		al.add(33);
		al.add(77);
		System.out.println(al.size());
		al.trimToSize();
		System.out.println(al.size());
		

	}

}
