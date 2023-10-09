package com.loosecoupling;
interface loan
{
	void calLoan();
}
class Homeloan implements loan
{
	int rate;
	int p;
	int t;
	
	public Homeloan(int rate,int p,int t) 
	{
		this.rate = rate;
		this.p=p;
		this.t=t;
	}
	public void calLoan()
	{
	System.out.println("rate of interest on home loan is: "+rate+"%");
	System.out.println("total amount to return: "+(p+(p*t*rate)/100));
	}
}
class educationloan implements loan
{
	float rate1;
	float rate2;// for abroad education
	int amount;
	int time;
	
	
	public educationloan(float rate1, float rate2,int amount,int time)
	{
		this.rate1 = rate1;
		this.rate2 = rate2;
		this.amount= amount;
		this.time= time;// years
	}


	public void calLoan()
	{
	System.out.println("rate of interest for education is: "+rate1+"%");
	System.out.println("rate of interest on education loan for abroad: "+rate2+"%");
	System.out.println("total interest : "+(amount*time*rate1)/100);
	System.out.println("total interest : "+(amount*time*rate2)/100);
	}
}
public class LoanCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // classes are not dependent in loose coupling 
		loan x;                            // by using interface.
		x=new Homeloan(15,500000,5);
		x.calLoan();
		System.out.println("-----------------------------------------------------------");
		x=new educationloan(10.5f,12.5f,200000,3);
		x.calLoan();
	}

}
