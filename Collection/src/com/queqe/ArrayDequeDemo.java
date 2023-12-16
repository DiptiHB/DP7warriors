package com.queqe;

import java.util.ArrayDeque;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Float>adq=new ArrayDeque<>();
		adq.add(80.5f);
		adq.add(75.5f);
		adq.add(91.8f);
		adq.add(30.5f);
		
		adq.addFirst(1.5f);
		adq.addLast(2.5f);
		adq.peekFirst();
		adq.peekLast();
		
		adq.removeFirst();
		adq.removeLast();
		System.out.println(adq);
		
		
		
	}

}
