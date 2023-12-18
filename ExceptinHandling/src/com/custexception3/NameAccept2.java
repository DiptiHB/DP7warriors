package com.custexception3;

import java.util.Scanner;

public class NameAccept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name: ");
		String name=sc.next();
		try {
			if(name.length()<4)
			{
				throw new InvalidNameException2("name must have at least 4 characters");
			}
			System.out.println("Hello "+name);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
