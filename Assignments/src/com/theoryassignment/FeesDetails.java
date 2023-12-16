package com.theoryassignment;
class Student
{
	private int id;
	private String name;
	protected int fees;
	Student()
	{
		
	}
	Student(int id,String name,int fees)
	{
		this.id=id;
		this.name=name;
		this.fees=fees;
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
	public void setFees(int fees)
	{
		this.fees=fees;
	}
	public int getFees()
	{
		return fees;
	}
	void payFees()
	{
		System.out.println("your monthly fees is: "+fees);
	}
	public String toString()
	{
		return "\n id: "+id+"\n name: "+name+"\n fees: "+fees;
		
	}
}
class clgStudent extends Student
{
	private int semNO;
	private String clgName;
	clgStudent()
	{
		super();
	}
	clgStudent(int id,String name,int fees,int semNO,String clgName)
	{
		super(id,name,fees);
		this.semNO=semNO;
		this.clgName=clgName;
	}
	public void setSemNO(int semNo)
	{
		this.semNO=semNo;
	}
	public int getSemNO()
	{
		return semNO;
	}
	public void setClgname(String clgName) 
	{
		this.clgName=clgName;
	}
	public String getClgName()
	{
		return clgName;
	}
	void payFees()
	{
		System.out.println("your halfyearly fees are: "+(6*fees));
	}
	public String toString()
	{
		return super.toString()+"\n semester: "+semNO+"\n college name: "+clgName;
	}
	
}
class SchoolStudent extends Student
{
	private int std;
	private String scName;
	SchoolStudent()
	{
		super();
	}
	SchoolStudent(int id,String name,int fees,int std,String scName)
	{
		super(id,name,fees);
		this.std=std;
		this.scName=scName;
	}
	public void setStd(int std)
	{
		this.std=std;
	}
	public int getStd()
	{
		return std;
	}
	public void setScName(String scName)
	{
		this.scName=scName;
	}
	public String getScName()
	{
		return scName;
	}
	void payFees()
	{
		System.out.println("your quarterly fees are: "+(3*fees));
	}
	public String toString()
	{
		return super.toString()+"\n std: "+std+"\n school name: "+scName;
	}
}
public class FeesDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s;
		s=new Student(101,"Dipti",5000);
		System.out.println(s);
		System.out.println("-----------------------------------------------");
		s.payFees();
		s=new clgStudent(102,"Prisha",4000,3,"Zeal");
		System.out.println(s);
		System.out.println("------------------------------------------------");
		s.payFees();
		s=new SchoolStudent(103,"prajakta",3000,9,"st.mary");
		System.out.println(s);
		System.out.println("------------------------------------------------------");
        s.payFees();
	}

}
