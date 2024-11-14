package com.sunbeam.assign3_Q1;

public class Stack {

	private int top;
	private int top2;
	private int arr[];
	private int arr1[];
	private int size;
	
	
	
	public Stack()
	{
		arr=new int[10];
		top=-1;
		
	}
	//check is Empty
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==size-1;
	}
	
	public void push(int value)
	{
		
		top++;
		arr[top]=value;
		
		 
	}
	

	public int pop()
	
	{
		
		int ele=arr[top];
		 top--;
		 return ele;
		
		
	}
	public void display()
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
