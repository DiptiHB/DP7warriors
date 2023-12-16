package com.arrylistlogical;

import java.util.ArrayList;

public class SortStringArrayList {
	static void sortElements(ArrayList<String>list)
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("Dipti");
		al.add("abhi");
		al.add("priya");
		al.add("vishnu");
		al.add("abhi");
		al.add("Ram");
		al.add("priya");
		al.add("jeet");
		al.add("omkar");
		 System.out.println("before sort: "+al);
		sortElements(al);
		System.out.println("after sort: "+al);

	}

}
