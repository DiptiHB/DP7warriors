package com.interfacedemo;
interface MessageService
{
	void sendMsg(String msg);
}
class WhatsApp implements MessageService
{
	public void sendMsg(String msg)
	{
	System.out.println("you are sending What'sApp message: "+msg);	
	}
}
class Facebook implements MessageService 
{
	public void sendMsg(String msg)
	{
		System.out.println("you are using facebook for message: "+msg);		
	}
	
}
class Instagram implements MessageService 
{
	public void sendMsg(String msg)
	{
	System.out.println("i think you are following latest trend: "+msg);
	}
}
public class MessageIntefaceInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhatsApp w1=new WhatsApp();
		w1.sendMsg("hey");
		System.out.println("-----------------------");
		Facebook f1=new Facebook();
		f1.sendMsg("welcome fb");
		System.out.println("--------------------------");
		Instagram i1=new Instagram();
		i1.sendMsg("DM me");
		System.out.println("***********************************");
		MessageService m;
		m=new WhatsApp();
		m.sendMsg("what's up");
		
		m=new Facebook();
		m.sendMsg("will you be my friend?");
		
		m=new Instagram();
		m.sendMsg("you are updated..FOLLOW ME");
		
		
	}

}
