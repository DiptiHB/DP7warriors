package com.containment3;

import java.util.Scanner;

public class ShowDetails {

		// TODO Auto-generated method stub
		static Scanner sc=new Scanner(System.in);
		
		void enterPrintDetails(Laptop a)
		{
			System.out.println("enter laptop configurartion: ");
			a.setLaptopConfig(sc.next());
			System.out.println("enter laoptop name: ");
			a.setLname(sc.next());
			System.out.println("enter price: ");
			a.setPrice(sc.nextInt());
			
			a.setPrint(new Printer());
			System.out.println("enter printer id: ");
			a.getPrint().setPrintId(sc.nextInt());
			System.out.println("enter printer name: ");
			a.getPrint().setPrintName(sc.next());
			System.out.println("enter printer price: ");
			a.getPrint().setPPrice(sc.nextInt());
		}
		void check(Printer p, Laptop b)
		{
			if(p.getPPrice()>=12000)
			{
				System.out.println(b.getLName());
			}
				
		}
		
		public static void main(String[] args) {
			ShowDetails s=new ShowDetails();
			Laptop b=new Laptop();
			Laptop b1=new Laptop();
		
			
			s.enterPrintDetails(b);
			s.enterPrintDetails(b1);
			System.out.println("------------------------------details----------------------------");
		    System.out.println(b);
			System.out.println(b1);
			
			System.out.println("------------after checking-------------------------- ");
			
			Printer p1=new Printer();
			Printer p2=new Printer();
			s.check(p1,b);
			s.check(p2,b1);
			
			
	}

}
