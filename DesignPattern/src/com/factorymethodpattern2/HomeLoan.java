package com.factorymethodpattern2;

public class HomeLoan extends Loan {
	
	public HomeLoan() {
		// TODO Auto-generated constructor stub
	}
	HomeLoan(String bankName)
	{
		super(bankName);
	}
	@Override
	public void LoanAmmount() {
		loanAmmount=6000000;
		
	}
	@Override
	public void ReturnTime() {
		time=4;
		
	}
	@Override
	public void rateofInterest() {
		// TODO Auto-generated method stub
		rate=8;
	}
}
