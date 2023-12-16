package com.methodoverrinding;

import java.io.IOException;

public class CheckedOverriding4 {
	class student
	{
		int mark=50;
		void printMarks()throws Exception//super type
		{
			System.out.println(mark);
		}
	}
	class clgStud extends student
	{
		int min=0;
		void printMarks()throws ArithmeticException,NullPointerException,IOException
		{                            //it allows all exception checked,unchecked
			if (min==0)
				throw new ArithmeticException();
			System.out.println(mark/min);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
