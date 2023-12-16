package com.arrylistlogical;
//create two String ArrayList.find Common Names from that
import java.util.*;
public class FindCommonName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1=new ArrayList<>();
		l1.add("Dipti");
		l1.add("Anjali");
		l1.add("Jeet");
		l1.add("Abhi");
		l1.add("Abhishek");
		System.out.println("list 1: "+l1);
		ArrayList<String> l2=new ArrayList<>();
		l2.add("Dipti");
		l2.add("Anurag");
		l2.add("Jeet");
		l2.add("Abhi");
		l2.add("Ram");
		System.out.println("list 2: "+l2);
		
		l1.retainAll(l2);
		System.out.println("common elements are:"+l1);
		
		
		
		
		
		

	}

}
