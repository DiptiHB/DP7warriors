package com.files;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileInputDemo {
	public void WriteDta(File f)
	{
		try {
			if(!f.exists())
			{
				f.createNewFile();
			}
			String data="I study in think quotient";
			FileOutputStream fout=new FileOutputStream(f);
			
			byte[] arr=data.getBytes();
			fout.write(arr);
			System.out.println("data added");
			fout.close();
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
				FileInputStream fin=new FileInputStream(f);
				int i=0;
				while((i=fin.read())!=-1)
				{
					System.out.print((char)i);
				}
				fin.close();
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
		fileInputDemo obj=new fileInputDemo();
		 File f2=new File("D:\\myfile\\first.txt");
		 f2.createNewFile();
		 obj.WriteDta(f2);
		 obj.readData(f2);
		 
	}

}
