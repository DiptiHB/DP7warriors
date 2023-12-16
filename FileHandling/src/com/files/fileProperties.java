package com.files;
import java.io.*;
public class fileProperties  {
 public static void main(String[] args)throws IOException {
	
	 File f1=new File("D:\\myfile\\firstfileDemo.txt");
	 f1.createNewFile();
	 if(f1.exists())
	 {
		 if(f1.isFile())
		 {
			 System.out.println("path "+f1.getAbsolutePath());
			 System.out.println("length "+f1.length());
			 System.out.println("File name "+f1.getName());
			 System.out.println("Write "+f1.canWrite());
		 }
		 else if(f1.isDirectory())
		 {
			 System.out.println("is a directory..");
		 }
		 else
		 {
			 System.out.println("unknown..");
		 }
	 }
	 else
	 {
		 System.out.println("File does not exist..");
	 }
}
}
