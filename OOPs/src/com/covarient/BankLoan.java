package com.covarient;
class Loan
{
int loanId;
String type;
Loan()
{
	
}
Loan(int loanId,String type)
{
	this.loanId=loanId;
	this.type=type;
	
}
 Loan provideLoan()
 {
	System.out.println("WELCOME WE PROVIDE LOAN"); 
 
    return new Loan();
 }

}
class HomeLoan extends Loan
{

	
	HomeLoan provideLoan()
	{
		System.out.println("HELLO **HOMELOAN**" );
		return new HomeLoan();
	}
}
class carLoan extends Loan
{
	carLoan provideLoan()
	{
		System.out.println("HELLO **CAR LOAN** ");
		return new carLoan();
	}
	
}
class EducationalLoan extends Loan
{ 
	EducationalLoan provideLoan()
	{
		System.out.println("HELLO **EDUCATIONAL LOAN**");
		return new EducationalLoan();
	}
}
class Bank
{
	int id;
	String bName;
	Bank()
	{
		
	}
	Bank(int id,String bName)
	{
		this.id=id;
		this.bName=bName;
	}
	Loan provideLoan()
	{
	return new Loan();	
	}
	public String toString()
	{
		return "id: "+id+" bank name: "+bName;
	}
}
class HDFC extends Bank
{
	float rate;
	
	 HDFC ()
	 {
		 super(); 
	 }
	 
	 
	public HDFC(int id,String bName,float rate)
	{
		super(id,bName);
		this.rate = rate;
	}

	carLoan provideLoan()
	{
		System.out.println("HDFC privide loan on cars !");
		return new carLoan();
	
	}
	public  String toString()
	{
		return super.toString()+" rate: "+rate;
	}
}
class ICICI extends Bank
{
	float rate2;
	
	 ICICI()
	 {
		 super();
		 
	 }
	 
	public ICICI(int id,String bName,float rate2) 
	{
		super(id,bName);
		this.rate2 = rate2;
	}

	HomeLoan provideLoan()
	{
		System.out.println("ICICI privide loan on home!");
		return new HomeLoan();
	}
	public  String toString()
	{
		return super.toString()+" rate: "+rate2;
	}
	
}
class SBI extends Bank
{
	float rate3;
	SBI()
	{
	super();	
	}
	SBI(int id,String bName,float rate3)
	{
		super(id,bName);
		this.rate3 = rate3;
	}
	EducationalLoan provideLoan()
	{
		System.out.println("SBI privide loan on education !");
		return new EducationalLoan();
	}
	public  String toString()
	{
		return super.toString()+"rate: "+ rate3;
	}
	
}
public class BankLoan 
{

	public static void main(String[] args) 
	{
		Bank b;
		b=new HDFC(111,"HDFC",6.5f);
		b.provideLoan();
		System.out.println(b);
		System.out.println("----------------------------------------------------");
		b=new ICICI(112,"ICICI",9.5f);
		b.provideLoan();
		System.out.println(b);
		System.out.println("------------------------------------------------------");
		b=new SBI(555,"SBI",8.5f);
		b.provideLoan();
		System.out.println(b);
		
		

	}

}
