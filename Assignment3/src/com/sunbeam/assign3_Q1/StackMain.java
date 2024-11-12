package com.sunbeam.assign3_Q1;

import java.util.Arrays;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack1=new Stack();
		Stack stack2=new Stack();
		
		for(int i=1; i<=10; i++)
		{
			stack1.push(i);
		}
		System.out.println("Array-");
		stack1.display();
		System.out.println();
		
		
		for(int i=1; i<=10; i++)
		{
			int ele=stack1.pop();
			stack2.push(ele);
			
		}
		System.out.println("Reversed Array- ");
		stack2.display();
		
	}

}

