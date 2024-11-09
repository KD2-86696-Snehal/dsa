package com.sunbeam.assign2_Q2;

public class SortBySalary {
	public static void main(String args[])
	{
		Employee e1=new Employee();
		
		Employee arr[]=new Employee[5];
		arr[0]=new Employee(1,"Anil",80000);
		arr[1]=new Employee(1,"Sunil",90000);
		arr[2]=new Employee(1,"Sham",40000);
		arr[3]=new Employee(1,"Ram",25000);
		arr[4]=new Employee(1,"Aanand",50000);
		
		
		System.out.println("*****Employees List*****");
		for(Employee e:arr)
		{
		System.out.println(e.toString());
		}
		System.out.println();
		e1.sortBySalary(arr, arr.length);
		
		System.out.println("***Employees after Sorting by Salary***");
		for(Employee e:arr)
		{
		System.out.println(e.toString());
		}
		
		
	}
	
	
}
