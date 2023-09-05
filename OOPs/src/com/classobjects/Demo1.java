package com.classobjects;

import com.accessmodifier.AcessDemo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcessDemo obj1=new AcessDemo();
		//obj.a=90;   //private cant access in differnt class or package
		//obj1.b=50;  // default acess specifier can't be accessible out side the package
				
		 obj1.d=14;
	    
		 //obj.show();            //private
		//obj1.display();         //default
				
		 obj1.test();
	}

}
