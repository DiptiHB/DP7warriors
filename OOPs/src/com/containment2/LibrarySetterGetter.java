package com.containment2;

public class LibrarySetterGetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BookX b1=new BookX();
    b1.setBId(1);
    b1.setBName("As you like it");
    b1.setPrice(350f);
    b1.setAuthor(new AurthorX());
    b1.getAuthor().setId(2);
    b1.getAuthor().setAName("willam shekspear");
    System.out.println(b1);
    
	}

}
