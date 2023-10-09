package com.interfaceadvance;
interface A
{
void show();	
}
interface B
{
void show();

}
class testing implements A,B
{
	public void show()
	{
		System.out.println("after implementing");
		
	}
}
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a;
		a=new testing();
		a.show();
		System.out.println("---------------------------------");
		B b;
		b=new testing();
		b.show();

	}

}
