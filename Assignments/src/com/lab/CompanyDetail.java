package com.lab;
class  company
{
	void address()
	{
	System.out.println("at Pune");	
	}
	
}
class eBay extends company
{
	void address()
	{
		System.out.println("at Mumbai");	
	}
	void product()
	{
		System.out.println("welcome to auction house!! eBay :cars,cloths,electrical products,top brands");
	}
}
public class CompanyDetail {
	public static void main(String args[])
	{
		company c;
		c=new company();
		c.address();
		System.out.println("-----------------------------------------");
		c=new eBay();
		c.address();
		//c.product();give error because we can't access sub class method using paren class reference
		System.out.println("-------------------------------------------------------------");
		
		eBay e= new eBay();
		e.product();
	}

}
