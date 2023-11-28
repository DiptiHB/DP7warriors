package com.stringbufferbuilder;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer();
		System.out.println( "old capacity: "+sb1.capacity());
		
		sb1.append("Dipti Bhalerao");
		System.out.println(sb1);
		
		System.out.println(sb1.reverse());
		
		sb1.reverse();
		System.out.println(sb1.replace(0, 2, "Tru"));//trupti
		System.out.println(sb1.replace(7, 8, "b"));// trupti bhalerao
		System.out.println(sb1.replace(0, 2, "Di"));//diupti bhalerao
		 
		System.out.println(sb1.deleteCharAt(2));//delete char u so o/p will be dipti bhalerao
		 
		System.out.println(sb1.append(" ThinkQutient"));
		
		System.out.println(sb1.insert(15, "is student in "));
		
		
		 
	}

}
