package com.methodoverrinding;


	class student
	{
		int mark=50;
		void printMarks()
		{
			System.out.println(mark);
		}
	}
	class clgStud extends student
	{
		int min=0;
		void printMarks()throws ArithmeticException // can only throw one unchecked exception
		{
			if (min==0)
				throw new ArithmeticException();
			System.out.println(mark/min);
		}
	}
	public class CheckedOverriding {

}
