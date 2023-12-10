package com.daoclass;
import java.util.*;
public class RegisterUser implements RegisterUserInterface {
	long accNo;
	String password;
	Scanner sc=new Scanner(System.in);
	@Override
	public void createAccount() {
		System.out.println("Enter Your Account Number: ");
	    accNo=sc.nextLong();
		System.out.println("Set Your Password: ");
	    password=sc.next();
		
		
		
	}

	@Override
	public void login() {
		System.out.println("Enter your account number: ");
		accNo=sc.nextLong();
		System.out.println("Enetr your passward :");
	    password=sc.next();
		
		
	}

	@Override
	public void showDetails() {
		
		
	}
	

}
