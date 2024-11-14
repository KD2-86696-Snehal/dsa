package com.sunbeam.assign5_Q1;

public class BST {

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
	
		public BST()
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
		
		public void preOrder(Node root)
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
		}
	
}
