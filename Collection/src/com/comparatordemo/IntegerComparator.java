package com.comparatordemo;
import java.util.*;
public class IntegerComparator {
	class MyIntegerComparator implements Comparator<Integer>
	{

		@Override
		public int compare(Integer o1, Integer o2)
		{
			
			return (o2-o1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(9);
		al.add(-3);
		al.add(6);
		al.add(-1);
		System.out.println(al);
		//Collections.sort(al,new MyIntegerComparator());
		
	}

}
