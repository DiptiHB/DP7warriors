package com.mapassignment;
//18.	WAP to get the greatest key strictly less than the given key.
// Return null if there is no such key.
import java.util.TreeMap;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	    Integer i=tm.ceilingKey(n);
	   
	    
	    
	}

}
