package com.arrylistlogical;

import java.util.ArrayList;

public class FindDupicate {
	static void findDuplicateElement(ArrayList<String>list)
	{
		int count;
		int i;
		for( i=0;i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("visited"))
				continue;
		   for(int j=i+1;j<list.size();j++)
		    {
			    if(list.get(i).equals(list.get(j)))
			    {
				count++;
				list.set(j, "visited");
			    }
			
		    }
		   if(count>1)
		   System.out.println(list.get(i)+"---->"+count);
	    }
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("Dipti");
		al.add("abhi");
		al.add("priya");
		al.add("Dipti");
		al.add("abhi");
		al.add("Dipti");
		al.add("priya");
		al.add("jeet");
		al.add("omkar");
		 findDuplicateElement(al);
	}

}
