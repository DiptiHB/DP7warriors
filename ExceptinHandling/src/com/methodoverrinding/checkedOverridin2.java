package com.methodoverrinding;

import java.io.IOException;

class Student1
{
	int mark=50;
	void printMarks()throws ArithmeticException//unchecked exception
	{
		System.out.println(mark);
	}
}
class ClgStud1 extends Student1
{
	int min=0;
	void printMarks()throws ArithmeticException,NullPointerException//can throw same or 
	                                                             //any unchecked exception
	{                                                          //but can't throw checked exception
		if (min==0)
			throw new ArithmeticException();
		System.out.println(mark/min);
	}
}


public class checkedOverridin2 {

	

}
