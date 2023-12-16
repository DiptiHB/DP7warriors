package com.arrylistlogical;
import java.util.*;
//join arrayList
public class JoinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(8);
		al.add(5);
		al.add(7);
		al.add(6);
		
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		
		al.addAll(5, al2);
		System.out.println(al);
		 
		
		
		

	}

}
