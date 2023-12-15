package com.factorymethodpattern2;

public class CarLoan extends Loan{
	public CarLoan() {
		// TODO Auto-generated constructor stub
	}
	CarLoan(String bankName)
	{
		super(bankName);
	}
	@Override
	public void LoanAmmount() {
		loanAmmount=500000;
		
	}
	@Override
	public void ReturnTime() {
		time=3;
		
	}
	@Override
	public void rateofInterest() {
		rate=6;
		
	}

}
