package com.factorymethodpattern2;

import java.util.Scanner;

public class LoanProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type of loan tou want(1)Home,2)Education,3)Car :");
		String ltype=sc.next();
		GetLoan gl=new GetLoan();
		Loan l=gl.getLoan(ltype);
		if(l==null)
		{
			System.out.println("OOPS!! something went wrong :(");
		}
		else
		{
			System.out.println("-------------------------------");
			System.out.println("Enter bank name :");
			l.setBankName(sc.next());
			System.out.println("------------------------------------");
			System.out.println("Welcome to the bank: "+l.bankName);
			l.LoanAmmount();
			System.out.println("amount that provided as loan: "+l.loanAmmount);
			l.ReturnTime();
			System.out.println("time interval: "+l.time);
			System.out.println("----------------------------------------");
			l.rateofInterest();
			System.out.println("Rate of interest: "+l.rate);
			System.out.println("--------------------------");
			l.show();
		}
	}

}
