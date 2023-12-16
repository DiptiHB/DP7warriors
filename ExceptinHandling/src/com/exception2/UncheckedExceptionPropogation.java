package com.exception2;

public class UncheckedExceptionPropogation {
	 void method() 
	 {
		 try
		 {
		 int data=50/0;
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }
	 void method2()
	 {
		 method();
	 }
	 void method3()
	 {
		 method2();
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UncheckedExceptionPropogation obj=new UncheckedExceptionPropogation();
		obj.method3();

	}

}
