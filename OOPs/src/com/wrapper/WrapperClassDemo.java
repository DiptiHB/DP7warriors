package com.wrapper;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23;
		Integer i=new Integer(25);// before jdk 1.5
		
		//conversion
		Integer j=Integer.valueOf(num);
		
		
		// automatic after jdk 1.5
		Integer k=num;
		System.out.println(num+" "+j+" "+k);
		
		// for unboxing
		Float f1=new Float(25.5f);// before 1.5 jdk
		float f2=f1.floatValue();
		
		// after jdk1.5 automatic
		
		Float f3=f1;
		System.out.println(f1+" "+f2+" "+f3);
		

	}

}
