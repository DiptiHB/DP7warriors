package com.statickeyword;
	class Patient
	{
		int id;
		String name;
		String date;
		static String docName;
		static String  hospitalName;
		static int count;
		static 
		{
			hospitalName="LifeCare";
			System.out.println("hospital name: "+hospitalName);
			docName="Dr.Rao";
			System.out.println("doctor:"+docName);
			count=0;
		}
		
		{
			
			count++;
		}
		Patient()
		{
			
		}
		
		Patient(int id,String name,String date)
		{
			this.id=id;
			this.name=name;
			this.date=date;
			
		}
		void show()
		{
			System.out.println("this patient having treatement under "+docName);
			System.out.println("id: "+id);
			System.out.println("name: "+name);
			System.out.println("date: "+date);
			
		}
		
	}
	public class Hospital {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
	Patient p1 =new Patient(1,"sumit","01/02/2023");
	Patient p2=new Patient(2,"kushal","2/02/2023");
	Patient p3=new Patient(3,"ram","03/02/2023");
	Patient p4=new Patient(4,"nani","04/02/2023");
	
	p1.show();
	p2.show();
	p3.show();
	p4.show();
	
	System.out.println("number of object created: "+Patient.count);  	    
	    
	}

}
