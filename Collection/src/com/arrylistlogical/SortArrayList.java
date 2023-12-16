package com.arrylistlogical;

import java.util.ArrayList;

public class SortArrayList {
	static void sort(ArrayList<Integer>list)
	{
		int i;
		for( i=0;i<list.size();i++)
		{
		   for(int j=i+1;j<list.size();j++)
		    {
			    if(list.get(i)>list.get(j))
			    {
				int temp=list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			    }
			
		    }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(5);
		al.add(7);
		al.add(6);
		al.add(1);
		al.add(4);
		al.add(9);
		al.add(6);
		al.add(2);
		System.out.println("before sort: "+al);
		sort(al);
		System.out.println("After sort: "+al);

	}

}
