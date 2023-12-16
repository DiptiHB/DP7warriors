package com.priorityqueue;


import java.util.PriorityQueue;

import com.linkedlist.Book;

public class BookPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Book>b1=new PriorityQueue<>();
		b1.add(new Book(1,"Alchemist",250));
		b1.add(new Book(2,"Indus Valley",341));
		b1.add(new Book(3,"Harry potter",750));
		b1.add(new Book(4,"Secrete",150));
		b1.add(new Book(5,"secrete seven",100));
		
		for(Book b:b1)
		{
			System.out.println(b);
		}
       
	}

}
