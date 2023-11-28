package com.string1;

public class StringInternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello";
		String s2=new String ("Hello");
		System.out.println(s1.hashCode());
		
		s2=s2.intern();
		System.out.println(s2.hashCode());
		
		//intern(): for memory management 
		
		System.out.println(s1==s2);
		

	}

}
