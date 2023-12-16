package com.arraylist;
import java.util.*;
public class NonGenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1=new ArrayList<>();
		list1.add(12);
		list1.add("dipti");
		list1.add(50.4f);
		list1.add('D');
		System.out.println(list1);
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			//int data=list1.get(i)+10;gives an error class cast exception
			//list1.set(i, data); error
		}

	}// to remove exception we have generic Arraylist

}
