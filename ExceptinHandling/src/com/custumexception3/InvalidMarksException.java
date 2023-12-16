package com.custumexception3;

public class InvalidMarksException extends RuntimeException {
	
	public InvalidMarksException()
	{
	super();	
	}
	public InvalidMarksException(String message)
	{
		super(message);
	}
}
