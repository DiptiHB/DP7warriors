package com.constructor;
class Student1
{
	private int id;
	private String name;
	private int age;

	Student1(int id, String name,int age)  
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public Student1() {
		
	}
	public String toString()
	{
		return id+" "+name+" "+age;
	}
  public void setId(int id)
  {
	  this.id=id;
  }
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
		
	}



}
public class paramConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(111,"Dipti",25);
		Student1 s2=new Student1(112,"toshada",23);
		Student1 s3=new Student1(113,"himali",22);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Student1 s4=new Student1();
		s4.setId(114);
		s4.setName("vrishali");
		s4.setAge(19);
		
		

	}

}
