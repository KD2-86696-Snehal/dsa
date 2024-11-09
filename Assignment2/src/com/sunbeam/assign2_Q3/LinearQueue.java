package com.sunbeam.assign2_Q3;

public class LinearQueue {
	
	private int front,rear;
	private int size;
	private int arr[];
	public LinearQueue(int size) {
		super();
		arr=new int[size];
		this.size = size;
		front=rear=0;
	}
	
	public LinearQueue()
	{
		
	}
	
	
	public void push(int value)
	{
		rear++;
		System.out.println(rear);
		arr[rear]=value;
	}
	public int pop()
	{
		int ele=arr[front+1];
		front++;
		return ele;
	}
	
	
	public int peek()
	{
		int ele=arr[front];
		return ele;
	}
	
	
	public boolean isEmpty()
	{
		return front==rear;
	}
	public boolean isFull()
	{
		return rear==size-1;
	}
	
	

}
