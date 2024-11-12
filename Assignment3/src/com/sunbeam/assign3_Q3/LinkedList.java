package com.sunbeam.assign3_Q3;

public class LinkedList {
	
	static class Node{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
		
	}
	
	private Node head;
	//private int size;
	
	public LinkedList()
	{
		head=null;
		//size=0;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		Node newNode=new Node(value);
		if(isEmpty())
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
		
	}
	
	public void addLast(int value)
	{
		Node newNode=new Node(value);
		if(isEmpty())
		{
			head=newNode;
		}
		else
		{
			Node trav=head;
			while(trav!=null)
			{
				trav=trav.next;
			}
			trav.next=newNode;
		}
		
	}
	
	public void addAfter(int key,int value)
	{
		Node newNode=new Node(value);
//		if(isEmpty())
//		{
//			head=newNode;
//		}
		
		Node trav=head;
		while(trav!=null)
		{
			if(key==trav.data)
			{
				newNode.next=trav.next;
				trav.next=newNode;
				break;
			}
			trav=trav.next;
			if(trav==null)
			{
			System.out.println("given Data is not present");
			}
			
		}

	}
	
	public void addBefore(int key,int value)
	{
		Node newNode=new Node(value);
//		if(isEmpty())
//		{
//			head=newNode;
//		}
		
		Node trav=head;
		while(trav.next!=null)
		{
			if(key==head.data)
			{
				addFirst(value);
				//break;
			}
			
			else if(key==trav.next.data)
			{
				newNode.next=trav.next;
				trav.next=newNode;
				break;
			}
			trav=trav.next;
			if(trav==null)
			{
			System.out.println("given Data is not present");
			}
			
		}

	}
	
	
	public void display()
	{
		Node trav=head;
		while(trav!=null)
		{
			System.out.print(" "+trav.data);
			trav=trav.next;
		}
		System.out.println();
	}

	
	
	

}
