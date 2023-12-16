package com.hashmap;
import java.util.*;
public class ArrayListToHashMapDemo {
	public static void creatMap(ArrayList<String>list)
	{
		HashMap<String ,Integer> h1=new HashMap<>();
		for(String s:list)
		{
			if(h1.containsKey(s))
			{
				h1.put(s, h1.get(s)+1);
			}
			else
			{
				h1.put(s, 1);
			}
		}
		for(Map.Entry<String, Integer> e:h1.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("A");
		al.add("C");
		al.add("D");
		al.add("B");
		al.add("A");
		al.add("D");
		System.out.println(al);
		
		creatMap(al);
		
		

	}

}
