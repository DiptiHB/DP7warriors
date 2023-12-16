package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class StoreData {
	public static void storeinfo(File f)
	{
		try {
			if(!f.exists())
			{
				f.createNewFile();
			}
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw=new FileWriter(f,true);
			System.out.println("Enter stop to finish.");
			String data="";
			while(true)
			{
				data=br.readLine();
				if(data.equalsIgnoreCase("stop"))
				break;
				fw.write(data);
				fw.write("\n");
			}
			System.out.println("--------------------------");
			br.close();
			fw.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//StoreData obj=new StoreData();
		 File f2=new File("D:\\myfile\\mydata.txt");
		storeinfo(f2);
	}

}
