package com.mapassignment;

import java.util.HashMap;
import java.util.*;

//16.	WAP to get the least key strictly greater than the given key. 
//Return null if there is no such key
public class Q16 {
	public static void main(String[] args) {
		TreeMap<Integer,String>tm =new TreeMap<>();
		tm.put(1, "Snow White");
	    tm.put(2, "Peparina");
	    tm.put(3, "Prince");
	    tm.put(4, "Slipendrella");
	    tm.put(5, "Clindrella");
	    tm.put(6, "weightless princess");
	    tm.put(7, "Sleeping beauty");
	    tm.put(8, "frog prince"); 
	    tm.put(9, "bakers");
	    
	    int n=5;
	    Integer i=tm.higherKey(n);
	    if(i!=null)
	    {
	    	System.out.println("least key strictly greater than  " +n +" "+i);
	    }
	    else
	    {
	    	System.out.println("there id no greter key than this key "+n);
	    }
	    
	}

}
