package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public void copyfile(File s,File d) throws IOException
	{
		if(s.exists())
		{
			d.createNewFile();
			FileInputStream fin=new FileInputStream(s);
			FileOutputStream fout=new FileOutputStream(d);
			int i=0;
			while((i=fin.read())!=-1)
			{
				fout.write(i);
			}
			System.out.println("File copied..");
			fin.close();
			fout.close();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CopyFile obj=new CopyFile();
		File S=new File("D:\\myfile\\bufferDemo.txt");
		File D=new File("D:\\myfile\\buffercopy.txt");
		obj.copyfile(S, D);
	}

}
