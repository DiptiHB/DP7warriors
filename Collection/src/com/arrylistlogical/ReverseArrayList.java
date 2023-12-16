package com.arrylistlogical;

import java.util.ArrayList;

public class ReverseArrayList {
	static void reverse(ArrayList<String>list)
	{
		for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--)
		{
			String temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
		
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
		System.out.println("befor: "+al);
		reverse(al);
		System.out.println("after: "+al);

	}

}
