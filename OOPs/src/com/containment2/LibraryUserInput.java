package com.containment2;
import java.util.Scanner;
public class LibraryUserInput {
	static Scanner sc=new Scanner(System.in);
	void enterDetails(BookX b)
	{
		System.out.println("enter book id: ");
		b.setBId(sc.nextInt());
		System.out.println("enter book name: ");
		b.setBName(sc.next());
		System.out.println("enter book price: ");
		b.setPrice(sc.nextFloat());
		
		
		
		b.setAuthor(new AurthorX());
		System.out.println("enter author id: ");
		b.getAuthor().setId(sc.nextInt());
		System.out.println("enter name: ");
	    b.getAuthor().setAName(sc.next());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryUserInput l1=new LibraryUserInput();
		BookX b2=new BookX();
		BookX b3=new BookX();
		l1.enterDetails(b2);
		l1.enterDetails(b3);
		
		System.out.println(b2);
		System.out.println(b3);
		
		
		
	}

}
