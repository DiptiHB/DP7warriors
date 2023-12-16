package com.custumexception2;

public class NotEligible extends RuntimeException {
	public NotEligible()
	{
		super();
	}
	public NotEligible(String message)
	{
		super(message);
	}

}
