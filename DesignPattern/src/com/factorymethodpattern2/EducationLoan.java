package com.factorymethodpattern2;

public class EducationLoan extends Loan{

	public EducationLoan() {
		// TODO Auto-generated constructor stub
	}
	EducationLoan(String bankName)
	{
		super(bankName);
	}
	@Override
	public void LoanAmmount() {
		loanAmmount=4000000;
		
	}

	@Override
	public void ReturnTime() {
		time=5;
		
	}
	@Override
	public void rateofInterest() {
		// TODO Auto-generated method stub
		rate=10;
	}

}
