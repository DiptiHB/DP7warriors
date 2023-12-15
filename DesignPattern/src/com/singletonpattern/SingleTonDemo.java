package com.singletonpattern;

public class SingleTonDemo {
	
	private static SingleTonDemo obj=new SingleTonDemo();
	public String msg;
	private SingleTonDemo()
	{
		msg="welcome";
	}
	public static SingleTonDemo getInstance()
	{
		if(obj==null)
			new SingleTonDemo();
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTonDemo s1=SingleTonDemo.getInstance();
		SingleTonDemo s2=SingleTonDemo.getInstance();
		SingleTonDemo s3=SingleTonDemo.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		s1.msg="hello";
		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);

	}

}
