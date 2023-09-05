package com.encapsulations;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Book b1=new Book();
		System.out.println("enter book id: ");
		b1.setBookId(sc.nextInt());
		System.out.println("enter book name: ");
		b1.setBName("sc.next()");
		System.out.println("enter book price: ");
		b1.setPrice(sc.nextInt());
       System.out.println(" "+b1.getBookId() +" "+ b1.getBName() +" "+ b1.getPrice());
       sc.close();
	}

}
