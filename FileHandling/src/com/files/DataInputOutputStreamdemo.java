package com.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamdemo {
	public void WriteDta(File f)
	{
		try {
			if(!f.exists())
			{
				f.createNewFile();
			}
			DataOutputStream dout=new DataOutputStream(new FileOutputStream(f));
			dout.writeInt(9);
			dout.writeUTF("Dipti Bhalerao");
			dout.writeFloat(87.5f);
			System.out.println("Student added..");
			dout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void readData(File f)
	{
		try {
			if(f.exists())
			{
				DataInputStream din=new DataInputStream(new FileInputStream(f));
				System.out.println("Roll no: "+din.readInt());
				System.out.println("Name : "+din.readUTF());
				System.out.println("Marks: "+din.readFloat());
				din.close();
				
			}
			else {
				System.out.println("file does not exist..");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputOutputStreamdemo obj=new DataInputOutputStreamdemo();
		 File f2=new File("D:\\myfile\\dataIo.txt");
		 f2.createNewFile();
		 obj.WriteDta(f2);
		 obj.readData(f2);

	}

}
