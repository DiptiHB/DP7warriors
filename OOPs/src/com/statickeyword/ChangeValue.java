package com.statickeyword;
class Value
{
	static int a;

static
{
a=10;	
}
static void changeValue()
{
	a=a+10;
}
}
public class ChangeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Value.a);
		Value.changeValue();
		System.out.println("after changing value");
		System.out.println(Value.a);
		
	}

}
