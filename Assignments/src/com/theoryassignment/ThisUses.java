package com.theoryassignment;

class UseofThis
{
	int id;
	String cName;
	float salary;
	public UseofThis()
	{
		this(0,"unknown");
		
	}
	public UseofThis(int id,String cName)
	{
		this.id=id;
		this.cName=cName;
		salary=80000;
		
	}
	UseofThis(int id,String cName,float salary)
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
	UseofThis bonus()
	{
		cName=cName+" you got bonus!!";
		return this;
	}
	

}
public class ThisUses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseofThis t1=new UseofThis(111,"Rudrapriya");
		t1.display();
		
		UseofThis t2=new UseofThis();
		System.out.println(t2.cName);//gives default value
		
		t2=t1.bonus();
		System.out.println(t1.cName+" id: "+t1.id+" salary: "+t1.salary);
	
}
}
