package com.basic;

import java.util.Scanner;

public class ConversionSmalltoUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any small letter: ");
		char ch=sc.next().charAt(0);
		char cap =(char)((char)ch-32);
		System.out.println("your entered letter is in upper case is: "+cap);
		
		System.out.println("Enter any capital letter: ");
		char rev=sc.next().charAt(0);
		char save=(char)((char)rev+32);
		System.out.println("your entered letter is small case is: "+save);
		sc.close();

	}

}
