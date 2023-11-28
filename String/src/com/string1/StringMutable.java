package com.string1;

public class StringMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		System.out.println(s1.hashCode());//differnt hash code
		s1="coreJava";
		System.out.println(s1.hashCode());//differnt hash code
		System.out.println(s1);
		System.out.println("----------------------------------------");
		
		String s2="Dipti";
		s2.concat("bhalerao");
		System.out.println(s2);//o/p: will be dipti only
		System.out.println(s2.hashCode());
		System.out.println("-------------------------------------");
		
		String s3="Dipti";
		s3=s3.concat("bhalerao");
		System.out.println(s3);//o/p: will be dipti bhalerao changed 
		System.out.println(s3.hashCode());
		System.out.println("----------------------------------------");
		
		String s4="Diptibhalerao";
		System.out.println(s4.hashCode());// will give same hash code as  s3

	}

}
