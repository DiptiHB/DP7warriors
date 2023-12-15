package com.singletonpattern;

public class Singletondemo2 {
	private static Singletondemo2 obj =new Singletondemo2();
	public String str;
	private Singletondemo2()
	{
		
	}
	public static Singletondemo2 getInstance()
	{
		if(obj==null);
		new Singletondemo2();
		return obj;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singletondemo2 st1=Singletondemo2.getInstance();
		st1.str="java";
		Singletondemo2 st2=Singletondemo2.getInstance();
		st2.str="Angular";
		Singletondemo2 st3=Singletondemo2.getInstance();
		st3.str="javaScript";
        
        System.out.println(st2.str);

        System.out.println("-----------------------------------");
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        
       
	}

}
