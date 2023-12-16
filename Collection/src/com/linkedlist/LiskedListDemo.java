package com.linkedlist;
import java.util.*;
public class LiskedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lk=new LinkedList<>();
		//System.out.println(lk.getFirst());//gives exception
		System.out.println(lk.peek());//null
		//System.out.println(lk.remove());//gives exception
		System.out.println(lk.poll());//null
		
		lk.add("Dipti");
		lk.add("Pratiksha");
		lk.add("Null");
		lk.add("sharvari");
		lk.add("Pratiksha");
		lk.addFirst("Abhishek");
		System.out.println(lk);
		lk.add(2,"rani");
		System.out.println("--------retrive method()----------------------");
		
		System.out.println("elements: "+lk.element());
		System.out.println("elements: "+lk.getFirst());
		System.out.println("elements: "+lk.peekFirst());
		System.out.println("elements: "+lk.peek());
		System.out.println(lk.get(2));
		System.out.println(lk.getLast());
		
		System.out.println("---------------------------------");
		
		
		
		
		

	}

}
