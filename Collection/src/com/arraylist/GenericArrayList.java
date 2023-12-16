package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer>list2=new ArrayList<>();
		list2.add(12);
		list2.add(65);
		list2.add(78);
		list2.add(90);
		System.out.println(list2);
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
			int data=list2.get(i)+10;
			list2.set(i, data);
		}
		System.out.println(list2);
	}

}
