package com.statickeyword;

import java.util.Scanner;

class TicketBookings
{
	int ticketId;
    int price=100;
    int noofTickets;
    static int availTicket;
    int totalAmount;
    static 
    {
    	availTicket=30;
    }
    TicketBookings()
    {
    	
    }
    TicketBookings(int ticketId,int availTicket,int noofTickets)
    {
    	this.ticketId=ticketId;
    	this.availTicket=availTicket;
    	this.noofTickets=noofTickets;
    }
    
    public void setTicketId( int ticketId )
    {
    	this.ticketId=ticketId;
        	
    }
    public int getTicketId()
    {
    	return ticketId;
    }
    public void setPrice(int price)
    {
    	this.price=price;
        	
    }
    public int getPrice()
    {
    	return price;
    }
    public void setAvailTicket(int availTicket)
    {
    	if(availTicket>0)
    	
    	this.availTicket=availTicket;
        	
    }
    public int getAvailTicket()
    {
    	return availTicket;
    }
    public String toString()
    {
    	
    	return "\n id:"+ticketId+"\n price"+price+"\n available tickets "+availTicket;
    }
    public int calculateTicketCost()
    {
    	
    	if(availTicket>=noofTickets)
    	{
    		availTicket=availTicket-noofTickets;
    	     totalAmount=noofTickets*price;
    		return totalAmount;
    	}
    	else
    		return -1;
    	
    }

	
}



public class TicketPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        TicketBookings t1=new TicketBookings();
        System.out.println("eneter number of booking: ");
        int n=sc.nextInt();
        System.out.println("AVAILABLE TICKETS ARE :"+t1.availTicket);
        for(int i=1;i<=n;i++)
        //while(t1.getAvailTicket()!=0)// conditionis true till available tickets are not zero.
        {
        	
        	System.out.println("enter ticket id: ");
        	t1.ticketId=sc.nextInt();
        	
        	System.out.println("price of each ticket is: "+t1.price);
        	
        	System.out.println("enter number of tickets you want: ");
        	t1.noofTickets=sc.nextInt();
        	
        	t1.calculateTicketCost();
        	
        	System.out.println("total ammount is: "+t1.totalAmount);
        	
        	System.out.println("AVAILABLE TICKETS AFTER BOOKING :"+t1.availTicket);
        	
        	
        }
	}

}
