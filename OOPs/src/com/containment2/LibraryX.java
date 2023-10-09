package com.containment2;

public class LibraryX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AurthorX a1=new AurthorX(1,"j.k Rowling");
		AurthorX a2=new AurthorX(2,"willam shekspear");
		AurthorX a3=new AurthorX(3,"sir aurthor conon doyal");
		AurthorX a4=new AurthorX(4,"agatha christie");
		
		BookX b1=new BookX(111,"Death on nile",500f,a4);
		BookX b2=new BookX(112,"Harry  Potter and Philosopher's stone",550f,a1);
		BookX b3=new BookX(113,"Twelth night",300f,a2);
		BookX b4=new BookX(114,"the sigh of four",450f,a3);
		BookX b5=new BookX(115,"harry potter and dealthy hollows",1200f,a1);
		BookX b6=new BookX(116,"And then there were none",750f,a4);
		BookX b7=new BookX(117,"All well the ends well",280f,a2);
		BookX b8=new BookX(118,"the hound of baskervilles",450f,a3);
		
		
		
		System.out.println(b1);
		System.out.println("------------------------------------------------");
		System.out.println(b2);
		System.out.println("------------------------------------------------");
		System.out.println(b3);
		System.out.println("------------------------------------------------");
		System.out.println(b4);
		System.out.println("------------------------------------------------");
		System.out.println(b5);
		System.out.println("------------------------------------------------");
		System.out.println(b6);
		 
		
		


	}

}
