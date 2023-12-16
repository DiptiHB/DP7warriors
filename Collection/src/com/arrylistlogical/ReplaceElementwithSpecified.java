package com.arrylistlogical;
//23.WAP to replace the second element of an ArrayList with the specified element
import java.util.*;
public class ReplaceElementwithSpecified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(5);
		al.add(111);
		al.add(45);
		System.out.println("before: "+al);
		
		al.set(2, 555);
		System.out.println("After: "+al);
	}

}
