package com.sunbeam.assign3_Q3;

import java.util.Scanner;

public class LinkedListMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice=-1;
		
		LinkedList l1=new LinkedList();
		l1.addFirst(50);
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		l1.display();
		
		
		while(choice!=0)
		{
			System.out.println("0.exit\n1.Add after Given Data\n2.add before Given Data-");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			
			
			switch(choice)
			{
			case 1:
				int ele=acceptElement(sc);
				int v=acceptValue(sc);
				l1.addAfter(ele, v);
				l1.display();
				break;
			case 2:
				ele=acceptElement(sc);
				v=acceptValue(sc);
				l1.addBefore(ele, v);
				l1.display();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");	
				break;
			}
			
		}
		
	}
	
	private static int acceptValue(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter element to add in List");
		int value=sc.nextInt();
		return value;
	}

	public static int acceptElement(Scanner sc) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter element from above list-");
		 int ele=sc.nextInt();
		
		return ele;
	}

}
