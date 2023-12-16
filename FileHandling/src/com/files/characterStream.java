package com.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class characterStream {
	public void WriteDta(File f)
	{
		try {
			if(!f.exists())
			{
				f.createNewFile();
			}
			FileWriter fw=new FileWriter(f);
			fw.write("my name is Dipti\n");
			fw.write("i am lreaning java");
			System.out.println("Added..");
			fw.close();
			
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
				FileReader fr=new FileReader(f);
				int i=0;
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
				}
				fr.close();
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
		characterStream obj=new characterStream();
		 File f2=new File("D:\\myfile\\CharDemo.txt");
		 f2.createNewFile();
		 obj.WriteDta(f2);
		 obj.readData(f2);
		 

	}

}
