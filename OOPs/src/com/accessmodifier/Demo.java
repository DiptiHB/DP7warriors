package com.accessmodifier;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcessDemo obj=new AcessDemo();
		//obj.a=90;   //private can't access in diffent class or package
		obj.b=50;
		obj.d=14;
		//obj.show();   //because it is private
		obj.display();
		obj.test();
	}

}
