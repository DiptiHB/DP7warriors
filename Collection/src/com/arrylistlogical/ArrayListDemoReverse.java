package com.arrylistlogical;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemoReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(6);
		al.add(2);
		al.add(1);
		al.add(8);
		al.add(9);
		System.out.println(al);
		System.out.println("------------------------------------");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}

}
