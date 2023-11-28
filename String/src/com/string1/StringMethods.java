package com.string1;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is fun";
		System.out.println(str.length());//():is imp in string because it is method in string
		
		//chatAt
		System.out.println(str.charAt(1));
		
		System.out.println(str.charAt(str.length()-1));
		
		// two string concat by using "concat "& "+"
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("-------------------------");
		//subString
		System.out.println(str.substring(1));
		System.out.println(str.substring(1, 6));
		System.out.println("----------------------------");
		
		//contains
		System.out.println(str.contains("ava"));
		System.out.println(str.contains("orl"));
		
		System.out.println("---------------------------------");
		// ignor case sesitivity
		String w1="hi";
		String w2="HI";
		System.out.println(w1.equalsIgnoreCase(w2));
		System.out.println("------------------------------------");
		
		//upper case lower case
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("--------------------------------------");
		
		//indecOf and lastIndexOf
		
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf("fun"));
		// isEmpty
		System.out.println("---------------------------------------");
		System.out.println(str.isEmpty());//false
		
		String s="";
		System.out.println(s.isEmpty());//true
		
		
	}

}
