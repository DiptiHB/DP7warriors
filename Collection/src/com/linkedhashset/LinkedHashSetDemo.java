package com.linkedhashset;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(21);
		lhs.add(54);
		lhs.add(46);
		lhs.add(null);
		lhs.add(78);
		lhs.add(12);
		System.out.println(lhs);//it maintain insertion order
		

	}

}
