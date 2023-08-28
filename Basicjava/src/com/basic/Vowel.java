package com.basic;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any letter: ");
		char ch=sc.next().charAt(0);
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("your entered letter is vowal:" +ch);
			
		}
		else
		{
			System.out.println("your entered letter is constant: "+ch);
		}
		
	sc.close();		
		
	}

}
