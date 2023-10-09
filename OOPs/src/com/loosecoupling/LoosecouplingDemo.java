package com.loosecoupling;


interface MessageSer
{
	void sendMsg(String msg);
}
class WhatsApp1 implements MessageSer
{
	String type;
	public void sendMsg(String msg)
	{
		this.type="WHATSAPP";
	System.out.println("you are sending What'sApp message "+type+": "+msg);	
	}
}
class Facebook1 implements MessageSer 
{
	String type;
	public void sendMsg(String msg)
	{
		this.type="FB";
		System.out.println("you are using facebook for message "+type+": "+msg);		
	}
	
}
class Instagram1 implements MessageSer 
{
	String type;
	public void sendMsg(String msg)
	{
		this.type="INSTA";
	    System.out.println("i think you are following latest trend: "+type+": "+msg);
	}
}
public class LoosecouplingDemo {
public void messageType(MessageSer m)
{
	m.sendMsg("WELCOME");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoosecouplingDemo l1=new LoosecouplingDemo();
		WhatsApp1 w1=new WhatsApp1();
		l1.messageType(w1);
		Facebook1 f1=new Facebook1();
		l1.messageType(f1);
		Instagram1 i1=new Instagram1();
		l1.messageType(i1);

	}

}
