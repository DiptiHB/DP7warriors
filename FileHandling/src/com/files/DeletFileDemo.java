package com.files;

import java.io.File;
import java.io.IOException;

public class DeletFileDemo {
	public void deletfile(File f)
	{
		try {
			if(f.exists())
			{
				if(f.delete())
				{
					System.out.println(f.getName()+" is deleted..");
				}
				else
				{
					System.out.println("Error..");
				}
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DeletFileDemo d1=new DeletFileDemo();
		File f1=new File("D:\\myfile\\firstfileDemo.txt");
		 f1.createNewFile();
		 d1.deletfile(f1);
		 

	}

}
