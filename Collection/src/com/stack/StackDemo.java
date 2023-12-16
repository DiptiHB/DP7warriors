package com.stack;


	class MyStack
	{
		int top;
		int size;
		int stk[];
		public MyStack()
		{
			
		}
		public MyStack(int size)
		{
			top=1;
			this.size=size;
			stk=new int[size];
		}
		boolean push(int data)
		{
			if(top<size-1)
			{
				top++;
				stk[top]=data;
				return true;
			}
			else
			{
				System.out.println("stack is full");
				return false;
				
			}
		}
		void pop()
		{
			if(top!=-1)
			{
				System.out.println("element deleted: "+stk[top]);
				top--;
			}
			else
			{
				System.out.println("Stack is empty");
			}
		}
		void display()
		{
			if(top!=-1)
			{
				System.out.println();
				System.out.print("[");
				for(int i=0;i<stk.length;i++)
				{
					System.out.println(stk[i]+",");
				}
				System.out.print("]");
				System.out.println();
				
			}
		}
	}
	public class StackDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s1= new MyStack(5);

	}

}
