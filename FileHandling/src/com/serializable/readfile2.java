package com.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class readfile2 {
	public void readfiles(File f) throws IOException
	{
	 char ch;
	 FileReader fr=null;
	 	try 
		{
		   fr=new FileReader(f);
		   int temp;
				 
			while((temp=fr.read())!=-1)	 
			{
		      System.out.print((char)temp);	
			}
				
		}catch(Exception e)
	 	{
			System.out.println(e);
	 	}
		finally
		{
			if(fr!=null)
			{
				fr.close();
			}
				
		}
		}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readfile2 r2=new readfile2();
		File f2=new File("D:\\myfile\\first.txt");
		r2.readfiles(f2);
	}

}
