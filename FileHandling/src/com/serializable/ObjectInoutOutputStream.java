package com.serializable;
import java.util.*;
import java.io.*;

public class ObjectInoutOutputStream {
	static Scanner sc=new Scanner(System.in);
	
	public void readData(File f)
	{
		try {
			if(f.exists())
			{
				ObjectInputStream oin=new ObjectInputStream(new FileInputStream(f));
				for(int i=0;i<3;i++)
				{
					Student stud=(Student)oin.readObject();
					System.out.println(stud);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void writeStudentData(File f) throws IOException
	{
		try {
		if(!f.exists())
		{
			f.createNewFile();
			
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oout=new ObjectOutputStream(new FileOutputStream(f));
		Student s[]=new Student[3];
		for(int i=0;i<s.length;i++)
		{
			 s[i]=new Student();
			
			 System.out.println("Enter student id: ");
			 s[i].setId(sc.nextInt());
			 
			 System.out.println("Enter name: ");
			 s[i].setName(br.readLine());
			 
			 System.out.println("Enter marks: ");
			 s[i].setMarks(sc.nextDouble());
			 
			 oout.writeObject(s);
			 System.out.println("Student"+(i+1)+" is added" );
			 
		}
		}
		catch(Exception e)
		{
			System.out.println(e); 
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjectInoutOutputStream st=new ObjectInoutOutputStream();
		File f2=new File("D:\\myfile\\objectinputoutputdemo.txt");
		//st.writeStudentData(f2);
		st.readData(f2);
		
	}

}
