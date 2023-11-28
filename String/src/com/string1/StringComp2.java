package com.string1;

public class StringComp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2=new String("java");
		System.out.println(s1==s2);//checking memory reference is equal or not
		System.out.println(s1.equals(s2));//checking content is equal or not
	}

}
