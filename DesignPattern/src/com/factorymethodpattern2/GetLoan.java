package com.factorymethodpattern2;

public class GetLoan {
	public Loan getLoan(String type)
	{
		if(type==null)
			return null;
		else if(type.equalsIgnoreCase("Home"))
			return new HomeLoan();
		else if(type.equalsIgnoreCase("Education"))
			return new EducationLoan();
		else if(type.equalsIgnoreCase("Car"))
			return new CarLoan();
	
		
		return null;
		
	}

}
