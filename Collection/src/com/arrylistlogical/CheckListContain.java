package com.arrylistlogical;
//15.	WAP to search the specified collection in this collection
import java.util.*;
public class CheckListContain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(2);
		al.add(5);
		al.add(8);
		al.add(9);
		al.add(33);
		al.add(77);
		
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(8);
		al2.add(9);
		al2.add(77);
		
	    System.out.println(al.containsAll(al2));
	    
	    for(int i=0;i<al.size();i+=2)
	    {
	    	System.out.println(al.get(i));
	    }
	    System.out.println("----------------------------------");
	    Iterator<Integer> itr=al.iterator();
	    while(itr.hasNext())
	    {
	    	int num=itr.next();
	    	System.out.println(num);
	    	if(itr.hasNext())
	    	{
	    		itr.next();
	    	}
	    	
	    }
		


		

	}

}
