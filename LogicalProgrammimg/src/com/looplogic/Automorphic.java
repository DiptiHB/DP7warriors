package com.looplogic;
import java.util.Scanner;
public class Automorphic {

	static boolean automorphic(int num)
	{
		int square=num*num;
		while(num>0)
		{
			if(num%10!=square%10)
			return false;
			num/=10;
			square/=10;
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number: ");
       int num=sc.nextInt();
       System.out.println(automorphic(num)?"automorphic":"not automorphic");
       sc.close();
	}

}
