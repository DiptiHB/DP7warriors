package com.queqe;
class MyQueue
{
  int front ;
  int rear;
  int arr[];
  int size;
  MyQueue()
  {
	  
  }
public MyQueue(int size) {
	super();
	front = 0;
	rear = 0;
	this.size=size;
	this.arr = new int[size];
}

	public void insert(int data)
	{
		if(rear<size)
		{
			arr[rear]=data;
			rear++;
			System.out.println("element inserted");
		}
		else
		{
			System.out.println("Queue is full");
		}
	}
	public void delete()
	{
		int temp;
		if(rear>front)
		{
			System.out.println("element deleted: "+arr[front]);
			for(temp=front;temp<rear-1;temp++)
			{
				arr[temp]=arr[temp+1];
			}
			arr[--rear]=0;
		}
		else
		{
			System.out.println("queue is empty");
		}
	}
	public void display()
	{
		if(rear>front)
		{
			for(int i=front;i<rear;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else
		{
			System.out.println("Queue is empty");
		}
	}
}
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue m1=new MyQueue();
		m1.insert(10);
		m1.insert(30);
		m1.insert(40);
		m1.insert(50);
		m1.insert(15);
		

	}

}
