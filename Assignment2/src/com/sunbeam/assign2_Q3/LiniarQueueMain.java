package com.sunbeam.assign2_Q3;

import java.util.Scanner;



public class LiniarQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int choice=0;
		int size=5;
		LinearQueue lq=new LinearQueue(size+1);
		
		do {
			System.out.println("0.exit\n1.push\n2.pop\n3.peek");
			System.out.println("Enter Your Choice-");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				if(lq.isFull())
				{
					System.out.println("Queue is Full");
				}
				else
				{
					System.out.println("Enter a element to push inside Queue-");
					int value=sc.nextInt();
					lq.push(value);
				}
				
				break;
			case 2:
				if(lq.isEmpty() )
				{
					System.out.println("Queue is Empty");
				}
				else 
				{
					int pop=lq.pop();
					System.out.println("Popped Element -"+pop);
				}
				
				break;
			case 3:
				if(lq.isEmpty())
				{
					System.out.println("Queue is Empty");
				}
				else
				{
					int peek=lq.peek();
					System.out.println("Element-"+peek);
				}
				
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			
			
		}while(choice!=0);

		
	}

}
