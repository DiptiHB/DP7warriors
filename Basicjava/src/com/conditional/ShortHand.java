package com.conditional;

public class ShortHand{
	public static void main(String args[])
	{
		byte b1=70;
		byte b2=12;
		//b1=b1+b2;giving error
         b1=(byte)(b1+b2);
         
         byte num1=80;
         byte num2=56;
        // num1+num1+num2 give error
         num1+=num2; // ShortHand removes type casting issues.
         System.out.println(num1);
         
         short s1=67;
         short s2=34;
        // s1=s1*s2; give error
         s1*=s2;
         System.out.println(s1);
         
         
		
		
	}

}
