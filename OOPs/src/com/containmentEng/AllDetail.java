package com.containmentEng;

import java.util.Scanner;

public class AllDetail {
//	static Scanner sc=new Scanner(System.in);
//	void showDetails()
//	{
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e1=new Engine();
		e1.setEngineType("diesel");
		e1.setPrice(350000);
		
		Machine m1=new Machine();
		m1.setMachineType("Automatic");
		m1.setE(e1);
		
	    CarDetail c1=new CarDetail();
	    c1.setModelNo(2023);
	    c1.setCarName("wagnR");
	    c1.setM(m1);
	    c1.getM().setE(e1);
	    System.out.println(c1);
	   
	    
	    System.out.println("--------------------------------------------------------------------");
	   
	    CarDetail c2=new CarDetail();
	    c2.setModelNo(2023);
	    c2.setCarName("Ford");
	    c2.setM(new Machine());
	    c2.getM().setMachineType("Manual");
	    c2.getM().setE(new Engine());
	    c2.getM().getE().setEngineType("petrol");
	    c2.getM().getE().setPrice(800000);
	    System.out.println(c2);
	   
	    
	    

	}

}
