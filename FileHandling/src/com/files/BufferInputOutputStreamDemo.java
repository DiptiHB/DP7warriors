package com.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputOutputStreamDemo {
	public void WriteDta(File f)
	{
		try {
			if(!f.exists())
			{
				f.createNewFile();
			}
			String data="we are learning java..";
			FileOutputStream fout=new FileOutputStream(f);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
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
				BufferedInputStream bin=new BufferedInputStream(new FileInputStream(f));
				
				int i=0;
				while((i=bin.read())!=-1)
				{
					System.out.print((char)i);
				}
				bin.close();
			}
			else {
				System.out.println("file does not exist..");
			}
		}
		catch(Exception e)
		{
			
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fileInputDemo obj=new fileInputDemo();
		 File f2=new File("D:\\myfile\\bufferDemo.txt");
		 f2.createNewFile();
		 obj.WriteDta(f2);
		 obj.readData(f2);

	}

}
