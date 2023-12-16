package com.methodoverrinding;

import java.io.IOException;

class Student2
{
	int mark=50;
	void printMarks()throws IOException//checked exceptin
	{
		System.out.println(mark);
	}
}
class ClgStud2 extends Student2
{
	int min=0;
	void printMarks()throws ArithmeticException,NullPointerException//,Exception it can not throw
																//super type exception
	{
		if (min==0)
			throw new ArithmeticException();
		System.out.println(mark/min);
	}
}
public class checkedOverridin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
