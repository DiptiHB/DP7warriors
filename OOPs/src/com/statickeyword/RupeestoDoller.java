package com.statickeyword;

import java.util.Scanner;

class Rupees
{
	private float rupees;
	static float dollervalue;
	float doller;
	static
	{
		dollervalue=83.09f;
	}
	Rupees()
	{
		
	}
	Rupees(float rupees,float doller)
	{
		this.rupees=rupees;
		this.doller=doller;
	}
	
	public void setRupees(float rupees) 
	{
		this.rupees = rupees;
	}
	public float getRupees() 
	{
		return rupees;
	}
	
	public static void setDollervalue(float dollervalue) 
	{
		Rupees.dollervalue = dollervalue;
	}
	public static float getDollervalue()
	{
		return dollervalue;
	}
	
	public void setDoller(float doller) 
	{
		this.doller = doller;
	}
	public float getDoller()
	{
		return doller;
	}
	void caldollers()
	{
		doller=rupees/dollervalue;
		System.out.println("rupees in doller: "+doller);
	}
	
}

public class RupeestoDoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Rupees r1=new Rupees();
		System.out.println("enter rupees : ");
		r1.setRupees(sc.nextFloat());
		r1.caldollers();
		sc.close();
	}

}
