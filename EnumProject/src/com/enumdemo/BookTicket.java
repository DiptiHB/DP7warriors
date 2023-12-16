package com.enumdemo;
import java.util.Scanner;
public class BookTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("choose ticket type: ");
		System.out.println("1.STANDARD");
		System.out.println("2.PREMIUM");
		System.out.println("3.RECLINER");
		
		int seattype=sc.nextInt();
		System.out.println("Enter number of seats: ");
		int num=sc.nextInt();
		MovieSeat ms=null;
		switch(seattype)
		{
		case 1:ms=MovieSeat.STANDARD;
			break;
		case 2:ms=MovieSeat.PREMIUN;
			break;
		case 3:ms=MovieSeat.RECLINER;
			break;
			default:
				System.out.println("Error!");
		}
		
		System.out.println("ticket type: "+ms);
		System.out.println("number of tickets: "+num);
		System.out.println("total price: "+(num*(ms.price)));
	}

}
