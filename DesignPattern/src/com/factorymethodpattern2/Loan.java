package com.factorymethodpattern2;

public abstract class Loan {

	public String bankName;
	public int loanAmmount;
	public int time;//in years
	public float rate;
	
	public Loan() {
		
	}
	public Loan(String bankName) {
		super();
		this.bankName = bankName;
	}	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public abstract void LoanAmmount();
	
	public abstract void ReturnTime();
	
	public abstract void rateofInterest();
	
	 public void show()
	 {
		 System.out.println("Thank you for Trusting on us :)");
	 }
}
