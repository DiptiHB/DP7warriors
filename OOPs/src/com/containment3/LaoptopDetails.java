package com.containment3;
import java.util.Scanner;
public class LaoptopDetails {
	
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
	


	public static void main(String[] args) {
		//  using constructor
//		Printer p=new Printer(1,"X:300");
//		Printer p1=new Printer(2,"X:350");
//		Printer p2=new Printer(3,"X:Lenovo");
//		
//		
//		Laptop l=new Laptop("RAM:16","HP",65000,p);
//		Laptop l1=new Laptop("RAM:12","dell",60000,p1);
//		Laptop l2=new Laptop("RAM:8","dell",55000,p2);
//		Laptop l3=new Laptop("RAM:16,gaming ","lenovo",80000,p);

//	    System.out.println(l);
//		System.out.println(l1);
//		System.out.println(l2);
//		System.out.println(l3);
//		
//		System.out.println("---------------using setter getter-------------- ");
//		Printer p4=new Printer();
//		p4.setPrintId(4);
//		p4.setPrintName("X:500");
//		
//		Laptop l4=new Laptop();
//		l4.setLaptopConfig("SSD:8Gb");
//		l4.setLname("DELL");
//		l4.setPrice(65000);
//		System.out.println(l4);
//		System.out.println(p4);
//		
		System.out.println("---------------------user input------------------------");
		LaoptopDetails v=new LaoptopDetails();
		
		Laptop l8=new Laptop();
		Laptop l9=new Laptop();
		v.enterPrintDetails(l8);
		
		v.enterPrintDetails(l9);
		System.out.println("----------------------------------------------------------");
		
		System.out.println(l8);
		System.out.println(l9);
		

	}

}
