package com.mapassignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//14.	WAP to get the portion of a HashMap whose keys are strictly less than a given key
public class Q14Portion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<>();
	    map.put(1, "Snow White");
	    map.put(2, "Peparina");
	    map.put(3, "Prince");
	    map.put(4, "Slipendrella");
	    map.put(5, "Clindrella");
	    map.put(6, "weightless princess");
	    map.put(7, "Sleeping beauty");
	    map.put(8, "frog prince"); 
	    map.put(9, "bakers");
	    
	  int n=5;
	  for(Map.Entry<Integer, String>e:map.entrySet())
	  {
		  if(e.getKey()<n)
		  {
			 System.out.println(e.getKey()+"-->"+e.getValue()); 
		  }
	  }
	  
	   
	    	    
	    
	    

	}

}
