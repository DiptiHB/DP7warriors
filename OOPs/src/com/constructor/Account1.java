package com.constructor;
class ThisUse
{
	int id;
	String cName;
	float salary;
	public ThisUse()
	{
		this(0,"unknown");
		
	}
	public ThisUse(int id,String cName)
	{
		this.id=id;
		this.cName=cName;
		salary=80000;
		
	}
	ThisUse(int id,String cName,float salary)
	{
		this.id=id;
		this.cName=cName;
		this.salary=salary;
	}
	void get()
	{
		String cNmae="Dipti";
		System.out.println(cName);
		System.out.println(this.cName);	
		
	}
	void display()
	{
		System.out.println("hello "+cName);
		System.out.println("your holiday is granted");
		this.calSalary();
	}
	void calSalary()
	{
		System.out.println("your salary is : "+ salary);
	}
	ThisUse bonus()
	{
		cName=cName+" you got bonus!!";
		return this;
	}
	
}


public class Account1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ThisUse t1=new ThisUse(111,"Rudrapriya");
		t1.display();
		
		
		ThisUse t3=new ThisUse();
		System.out.println(t3.cName);
		
		t3=t1.bonus();
		System.out.println(t1.cName+"  "+t1.id+" "+t1.salary);
		
		
		
		
		
		
		

	}

}
