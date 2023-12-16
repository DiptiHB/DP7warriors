package com.arrylistlogical;

import java.util.ArrayList;

public class SwapArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(13);
		al.add(10);
		al.add(19);
        System.out.println("Before: "+al);
		
        int temp=al.get(0);
		al.set(0, al.get(3));
		al.set(2, temp);
		System.out.println("after: "+al);
	}

}
