package com.string1;

public class Equalscomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2="java";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("----------------------------------");
		
		String s3=new String("hello");
		String s4=new String("hello");
		System.out.println(s3==s4);//will be false. it equals to memory reference
		System.out.println(s3.equals(s4));// true: it equals to content

	}

}
