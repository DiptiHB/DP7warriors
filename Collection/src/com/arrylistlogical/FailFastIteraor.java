package com.arrylistlogical;

import java.util.*;

public class FailFastIteraor {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("Dipti");
		al.add("ritu");
		al.add("shiv");
		al.add("vishnu");
		al.add("angad");
		al.add("Ram");
		System.out.println("befor: "+al);
		// remove shiv
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("shiv"))
			{
				//al.remove("shiv");//concurrentModificationException
				itr.remove();
			}
		}
		System.out.println(al);

	}

}
