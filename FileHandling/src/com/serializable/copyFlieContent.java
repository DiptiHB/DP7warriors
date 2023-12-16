package com.serializable;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyFlieContent {
	public void readfiles(File f,File f2) throws IOException
	{
	 char ch;
	 FileReader fr=null;
	 FileWriter fw=null;
	 	try 
		{
		   fr=new FileReader(f);
		   fw=new FileWriter(f2);
		   int temp;
		System.out.println(fw.append('p'));		 
			while((temp=fr.read())!=-1)	 
			{
		      System.out.print((char)temp);
		      fw.write(temp);
		      
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
		copyFlieContent r=new copyFlieContent();
		
		File f2=new File("D:\\myfile\\first.txt");
		File f3=new File("D:\\firstfiletowrite.txt");
		r.readfiles(f2, f3);

	}

}
