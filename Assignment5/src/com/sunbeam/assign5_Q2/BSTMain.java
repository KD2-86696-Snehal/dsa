package com.sunbeam.assign5_Q2;

import java.util.Scanner;

import com.sunbeam.assign5_Q1.BST;

public class BSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		BSTSearch b1=new BSTSearch();
		b1.addNode(8);
		b1.addNode(10);
		b1.addNode(6);
		b1.addNode(3);
		b1.addNode(13);
		b1.addNode(9);
		b1.addNode(11);
		b1.addNode(4);
		
		b1.preOrder();
		System.out.println("Enter Element to search-");
		int value=sc.nextInt();
		b1.BinarySearch(value);
		
	}

}
