package com.serializable;

import java.io.File;
import java.io.FileInputStream;


public class readFile {
	public void readfiles(File f)
	{
		char ch;
		 int j;
		 try {
			 FileInputStream fin=new FileInputStream(f);
			 while((j=fin.read())!=-1)
			 {
				 System.out.print((char)j);
			 }
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFile r1=new readFile();
		 File f2=new File("D:\\myfile\\first.txt");
		 r1.readfiles(f2);
		 
		 
	}

}
