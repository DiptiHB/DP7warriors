package com.constructor;


  class Account
  {
	  private int id;
	  private String name;
	  private int balance;
	  private String status;
	  Account()
	  {
		  
	  }
	  Account(int id,String name,int balance,String status)
	  {
		  this.id=id;
		  this.name=name;
		  this.balance=balance;
		  this.status=status;
		  
	  }
	  public void setId( int id)
	  {
		  this.id=id;
	  }
	  public int getId()
	  {
		  return id;
	  }
	  public void setName( String name)
	  {
		  this.name=name;
	  }
	  public String getName()
	  {
		  return name;
	  }
	  
	  public void setBalance( int balance)
	  {
		  this.balance=balance;
	  }
	  public int getBalance()
	  {
		  return balance;
	  }
	  public void setStatus(String status)
	  {
		  this.status=status;
	  }
	  public String getStatus()
	  {
		  return status;
	  }
	  public String toString()
	  {
		  return id+" "+name+" "+balance+" "+status;
	  }
	  
  }
	
  public class Bank {
	  
	  static void allocateStatus(Account a)
	  {
		  if(a.getBalance()<0)
			{
			  System.out.println(a);
			  a.setStatus("deactive");  
			} 
		  else
		  {
			  System.out.println(a);
			  a.setStatus("active");  
		  }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account(1,"Dipti",10000,"active");
		Account a2=new Account(2,"toshada",0,"deactive");
		Account a3=new Account(3,"himali",0,"deactive");
		Account a4=new Account(4,"emily",25000,"active");
		Account a5=new Account(5,"Pratiksha",120000,"active");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println("************************after checking status***********************");
	    allocateStatus(a1);
		allocateStatus(a2);
		allocateStatus(a3);
		allocateStatus(a4);
		allocateStatus(a5);
		
		
			
		

	}

}
