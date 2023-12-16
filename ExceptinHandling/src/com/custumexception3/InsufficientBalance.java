package com.custumexception3;

public class InsufficientBalance extends RuntimeException{
	
	public InsufficientBalance() {
		super();
	}
	public InsufficientBalance(String message)
	{
		super(message);
	}
	
}
