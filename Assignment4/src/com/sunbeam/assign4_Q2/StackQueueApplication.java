package com.sunbeam.assign4_Q2;

public class StackQueueApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList stack = new linkedList();
		linkedList queue = new linkedList();
		
		
		System.out.println("STACK");
		stack.addFirst(50);
		stack.addFirst(40);
		stack.addFirst(30);
		stack.addFirst(20);
		stack.addFirst(10);
		stack.display();
		
		stack.deleteFirst();
		
		System.out.println("After Popping Elemenyt from Stack");
		stack.display();
		stack.peek();
		
		System.out.println("QUEUE");
		queue.addLast(100);
		queue.addLast(90);
		queue.addLast(80);
		queue.addLast(70);
		queue.addLast(60);
		queue.addLast(50);
		
		queue.display();
		queue.deleteFirst();
		System.out.println("After deleteing element from Queue");
		queue.display();
		
		queue.peek();
		
		
		
	}

}
