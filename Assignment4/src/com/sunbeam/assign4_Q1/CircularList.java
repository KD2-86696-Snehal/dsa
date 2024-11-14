package com.sunbeam.assign4_Q1;

public class CircularList {

	static class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
		
		
		
		
	}
	private Node tail;
	private int size;
	
	public CircularList()
	{
		tail=null;
		size=0;
	}
	
	public boolean isEmpty()
	{
		return tail==null;
	}
	
	public void addLast(int value)
	{
		
		Node newNode=new Node(value);
		if(isEmpty())
		{
			tail=newNode;
			newNode.next=newNode;
			//System.out.println(tail.data);
			
			
		}
		else
		{
			
			newNode.next=tail.next;
			tail.next=newNode;
			tail=newNode;
			//System.out.println(tail.data);
		}
		size++;
	}
	
	public void addFirst(int value)
	{

		Node newNode=new Node(value);
		if(isEmpty())
		{
			newNode.next=tail;
			tail=newNode;
			
			
		}
		
		else
		{
			newNode.next=tail.next;
			tail.next=newNode;
			
		}
		size++;
	}
	
	public void addPosition(int value,int pos)
	{
		Node newNode=new Node(value);
		
		if(pos<0||pos>size+1)
		{
			return;
		}
		if(pos==1)
		{
			addFirst(value);
			return;
		}
		if(pos==size+1)
		{
			addLast(value);
			return;
		}
		
		if(isEmpty())
		{
			newNode.next=tail;
			tail=newNode;
		}
		else
		{
			Node trav=tail;
			for(int i=1; i<pos-1; i++)
			{
				trav=trav.next;
			}
			trav=trav.next;
			newNode.next=trav.next;
			trav.next=newNode;
			
		}
		size++;
	}
	
	
	 public void deleteFirst() {
		   if(isEmpty()) {
			   return ;
		   }
		   else if(tail==tail.next){
			   tail=null;
		   }
		   else {
			   tail.next=tail.next.next;
				// System.out.println("delete first"+tail.data);

		   }
		   
		   size--;
	   }
	 
	 
	 
	  
	
	 public void deleteLast() {
		   if(isEmpty()) {
			   return;
		   }
		   else if(tail==tail.next) {
			   tail=null;
		   }else 
		   {
			   Node trav=tail;
			   
			   while(trav.next.next!=tail)
			   {
				  trav=trav.next;
			  }
			  trav.next.next=tail.next;
			 tail=trav.next;
			
		   }
		   size--;
	   }
	
	 
	 
	 
	  public void deleteAtPos(int pos)
	  {
		   if(pos<0 || pos>size)
		   {
			   return;
		   }
		   else if(tail==null) 
		   {
			   return;
		   }
		   if(pos==1)
		   {
			   deleteFirst();
			   return;
		   }
		   if(pos==size)
		   {
			   deleteLast();
			   return;
		   }
		   else {
			   Node trav=tail;
			  for(int i=1;i<pos;i++)
			  { 
				  trav=trav.next;
			  }
			 trav.next=trav.next.next;
		   }
		   size--;
	   }
	 
	 
	 
	public void display()
	{
		Node trav=tail;
		do {
			System.out.print(" "+trav.next.data);
			trav=trav.next;
			//System.out.println(trav.data);
		}while(trav!=tail);
		System.out.println();
	}
	
//	 public void display() {
//		   Node trav=tail.next;
//		   for(int i=0;i<size;i++) {
//			 
//			  System.out.println(trav.data);
//			  trav=trav.next;
//		   }
//	   }

}
