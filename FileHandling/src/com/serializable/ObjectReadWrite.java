package com.serializable;
import java.util.*;
import java.io.*;
public class ObjectReadWrite {
	static Scanner sc=new Scanner(System.in);
	public void writedata(File f)
	{
		try {
			if(!f.exists())
			{
				f.createNewFile();
			}
			//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			ObjectOutputStream oout=new ObjectOutputStream(new FileOutputStream(f));
			StudentInfo s=new StudentInfo("Dipti",25);
			
			oout.writeObject(s);
			System.out.println("Student is added" );
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void readData(File f)
	{
		try {
			if(f.exists())
			{
				ObjectInputStream oin=new ObjectInputStream(new FileInputStream(f));
					StudentInfo std=(StudentInfo)oin.readObject();
					System.out.println(std);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ObjectReadWrite obj=new ObjectReadWrite();
		File f2=new File("D:\\myfile\\objectreadwite.txt");
		//obj.writedata(f2);
		obj.readData(f2);
	}

}
