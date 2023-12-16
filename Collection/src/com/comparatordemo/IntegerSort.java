package com.comparatordemo;
//WAP to sort the elements of List that contains Integer objects.Print ArrayList.Sort using 
//Collections.sort(list) method.Print ArrayList.

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(25);
		al.add(30);
		al.add(45);
		al.add(15);
		al.add(89);
		al.add(95);
		Collections.sort(al);
		System.out.println(al);

	}

}
