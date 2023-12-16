package com.arrylistlogical;

import java.util.ArrayList;

//16.	WAP to retrieve an element (at a specified index) from a given ArrayList
public class RetriveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(8);
		al.add(5);
		al.add(7);
		al.add(6);
		for(int i=0;i<al.size();i++)
		{
		System.out.println(al.get(i));
		}

	}

}
