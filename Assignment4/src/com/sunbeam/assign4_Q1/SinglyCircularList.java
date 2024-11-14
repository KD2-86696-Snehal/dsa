package com.sunbeam.assign4_Q1;

public class SinglyCircularList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularList cl=new CircularList();
		
		cl.addLast(10);
		cl.addLast(20);
		cl.addLast(30);
		cl.addLast(40);
		cl.addLast(50);
		
		
		cl.display();
		
		cl.addFirst(5);
		cl.display();
		
		cl.addPosition(90, 3);
		cl.display();
		
		System.out.println("Delete first");
		cl.deleteFirst();
		
		cl.display();
		System.out.println("Delete last");
		cl.deleteLast();
		cl.display();
//		
		
		System.out.println("Delete at position");
		cl.deleteAtPos(3);
		cl.display();
	}

}
