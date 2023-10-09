package com.abstactclass;
abstract class Book
{
  int bookId;
  String name;
 Book()
 {
	 
 }
 Book(int bookId,String name)
 {
	 this.bookId=bookId;
	 this.name=name;
 }
  abstract void display();
}
class HistoricalBook extends Book
{
	String type;
	float price;
	HistoricalBook()
	{
		super();
	}
	HistoricalBook(int bookId,String name,String type,float price)
	{
		super(bookId,name);
		this.type=type;
		this.price=price;
	}
	void display()
	{
		System.out.println("book id: "+bookId);
		System.out.println("book name: "+name);
		System.out.println("book type: "+type);
		System.out.println("book price: "+price);
		
	}
}
class Fictional extends Book
{
	String ficType;
	String publish;
	Fictional()
	{
		super();
		
	}
	Fictional(int bookId,String name,String ficType,String publish)
	{
		super(bookId,name);
		this.ficType=ficType;
		this.publish=publish;
		
	}
	void display()
	{
		System.out.println("book id: "+bookId);
		System.out.println("book name: "+name);
		System.out.println("fiction type: "+ficType);
		System.out.println("publish on : "+publish);
	}
	
}
public class BooksDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b;
		b=new HistoricalBook(1,"war and peace","modern",800f);
		b.display();
		System.out.println("--------------------------------------------------");
		b=new Fictional (2,"harappa a curse of blood river","historical","2016");
		b.display();

	}

}
