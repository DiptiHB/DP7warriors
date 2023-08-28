package com.operators;
import java.util.Scanner;
public class CharDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit/char/special symbol");
	
		char ch =sc.next().charAt(0);
		
		if (ch>='a' && ch<='z')
		{
			System.out.println(" It is small character");
		}
		
		else if(ch>=0 && ch<='9')
		{
			System.out.println("It's a digit");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("It is capital character");
		}
		else
		{
			System.out.println("It is special symbol");
		}
		sc.close();
	}


}
