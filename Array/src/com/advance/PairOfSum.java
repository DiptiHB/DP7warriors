package com.advance;

public class PairOfSum {
	static void findPair(int a[],int sum)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>sum)
			{
				continue;
			}
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]+a[j])==sum)
				{
					System.out.println("( "+a[i]+","+a[j]+" )");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,1,6,7};
		int sum=5;
		findPair(arr,sum);
	}

}
