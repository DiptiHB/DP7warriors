package com.statickeyword;

class StudentY {

	private int id;
	String name;
	int marks;
	static String scName="ABC";
	static int sCount;
	static
	{
		sCount=0;
	}
	
	static
	{
		System.out.println("************static block 1:");
		System.out.println(scName);
		scName="XYZ";
		System.out.println(" after change");
		System.out.println(scName);
	}
	
	static
	{
		System.out.println("*******static block 2:");
		System.out.println(scName);
		scName="MGV";
		System.out.println("after change");
		System.out.println(scName);
	}
	
	{
		sCount++;
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
	public void setMarks(int marks)
	{
		this.marks=marks;
		
	}
	public int getMarks()
	{
		return marks;
	}
	public String toString()
	{
		return id+" "+name+" "+marks; 
	}
	
}
public class StudentX
{
 public static void main(String[] args) {
	 StudentY s1=new StudentY();
	 System.out.println(s1.scName);
	 
	 StudentY s2=new StudentY();
	 System.out.println(s2.scName);
	
	 s2.scName="st.joseph";
	 System.out.println(s2.scName);
	
	 
	 System.out.println("number of objects created");
	 System.out.println(StudentY.sCount);
	 
	 
}

}
