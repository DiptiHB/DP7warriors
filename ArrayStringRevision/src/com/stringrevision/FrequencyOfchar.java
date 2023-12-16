package com.stringrevision;

public class FrequencyOfchar {
	public static void findfrequency(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			boolean visited =false;
			int count=1;
			for(int j=i-1;j>=0;j--)
			{
				if(str.charAt(i)==str.charAt(j))
				{
				visited=true;
				break;
				}
			}
			if(visited==false)
			{
				for(int k=i+1;k<str.length();k++)
				{
					if(str.charAt(i)==str.charAt(k))
					{
						count++;
					}
				}
//				System.out.print(str.charAt(i));
//				System.out.println(""+"-->"+count);
				if(count==1)
				{
					System.out.println("First non repeating character is: "+str.charAt(i));
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="peter pan";
		findfrequency(s);
	}

}
