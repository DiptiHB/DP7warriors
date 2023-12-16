package com.hashtable;
import java.util.*;
public class hashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String>ht=new Hashtable<>();
		ht.put(1, "Dipti");
		ht.put(2, "pratik");
		ht.put(3, "ram");
		ht.put(4, "shivai");
		System.out.println(ht.put(4, "kajal"));
		ht.put(5, "abhisha");
		System.out.println(ht);

	}//no null keys and null values are allowed

}
