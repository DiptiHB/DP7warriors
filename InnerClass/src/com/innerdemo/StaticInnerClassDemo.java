package com.innerdemo;
class outer1
{
	static int value=100;
    int data=50;
    void display()
    {
    	System.out.println("outer: "+value);
    	System.out.println("outer: "+data);
    }
    
    static class inner1
    {
    	String msg1="hello";
    	static String msg2="welcome";
    	void show()
    	{
    	System.out.println("Inner :"+value);
    	System.out.println("inner: "+msg1);
    	System.out.println("inner: "+msg2);
    	
    	outer1 o1=new outer1();
    	o1.display();
    	System.out.println("inner: "+o1.data);
    	} 
    }
}
public class StaticInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        outer1.inner1 i1=new outer1.inner1();
        i1.show();
	}

}
