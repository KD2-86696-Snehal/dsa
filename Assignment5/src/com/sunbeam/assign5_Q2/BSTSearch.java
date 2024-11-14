package com.sunbeam.assign5_Q2;



public class BSTSearch {

	public static class Node
	{
		private int data;
		private Node left,right;
		
		public Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	
	private Node root;
	
		public BSTSearch()
		{
			root=null;
		}
		
		public boolean isEmpty()
		{
			return root==null;
		}
		
		
		
		public void addNode(int value)
		{
			
			Node newNode=new Node(value);
			if(root==null)
			{
				
				root=newNode;
			}
			else
			{
				
				addNode(value,root);
			}
		}
		
		public void addNode(int value,Node trav)
		{
			Node newNode=new Node(value);
//			if(isEmpty())
//			{
//				root=newNode;
//			}
			//else
			//System.out.println("here");
			 
				if(value<trav.data)
				{
					if(trav.left==null)
					{
						trav.left=newNode;
						return;
					}
					else
					{
						addNode(value,trav.left);
					}
				}
				else if(value>trav.data)
				{
					
					if(trav.right==null)
					{
						
						trav.right=newNode;
						return;
					}
					else
					{
						addNode(value,trav.right);
					}
				}
				
			
		}
		
		
		private Node BinarySearch(int key,Node trav)
		{
			
			if(trav==null)
			{
				return null;
			}
			if(key==trav.data)
			{
				return trav;
			}
			
			else if(key>trav.data)
			{
				return BinarySearch(key,trav.right);
			}
			else
			{
				return BinarySearch(key,trav.left);
			}
			
			
		}
		
		public void BinarySearch(int value)
		{
			Node trav=BinarySearch(value,root);
			if(trav!=null)
			{
				System.out.println("Element found");
			}
			else
			{
				System.out.println("Element not Found");
			}
		}
		
		
		private void preOrder(Node root)
		{
			Node trav=root;
			if(trav==null)
			{
				return;
				
			}
			System.out.print(" "+trav.data);
			preOrder(trav.left);
			preOrder(trav.right);
		}
		public void preOrder()
		{
			System.out.println("preorder-");
			preOrder(root);
			System.out.println();
		}
	

	
}
