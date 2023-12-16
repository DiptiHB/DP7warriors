package com.enumdemo;

public enum MovieSeat {
	STANDARD(300),PREMIUN(450),RECLINER(600);
	
	public int price;
	
	private MovieSeat(int price)
	{
		this.price=price;
	}

}
