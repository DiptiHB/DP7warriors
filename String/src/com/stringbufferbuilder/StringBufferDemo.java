package com.stringbufferbuilder;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer(5);
		System.out.println( "old capacity: "+sb1.capacity());
		
//		StringBuffer sb2=new StringBuffer("Hello");
//		System.out.println( sb2.capacity());
//		
//		StringBuffer sb3=new StringBuffer();
//		System.out.println( sb3.capacity());
		
		sb1.append("Hello");
		System.out.println(sb1);
		
		sb1.append("world");
		System.out.println(sb1);
		System.out.println("capacity: "+sb1.capacity());//capacity=(oldcap*2)+2;
		
	}

}
