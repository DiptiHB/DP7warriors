package com.loosecoupling;
interface keyboard
{
	String display();
	
}
class Dell implements keyboard
{

	@Override
	public String display() {
		String a="hello DELL";
		return a;
	}
	
}
class HP implements keyboard
{

	@Override
	public String display() {
		String b="welcome to HP";
		return b;
	}
	
}
class key 
{
	void display(keyboard k)
	{
	System.out.println(k.display());	
	}
}
public class KeyboardDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		key k2=new key();
		keyboard x;
		x=new Dell();
		k2.display(x);
		
		x=new HP();
		k2.display(x);
		
		
		
		
		
		

	}

}
