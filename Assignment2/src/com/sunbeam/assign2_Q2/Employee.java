package com.sunbeam.assign2_Q2;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee()
	{
	
	}
	
	public Employee(double salary)
	{
		this.salary=salary;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
	public void sortBySalary(Employee employee[],int length)
	{
		for(int i=0; i<length; i++)
		{
			Employee temp=employee[i];
			int j;
			for(j=i-1; j>=0&& employee[j].salary<temp.salary; j--)
			{
				employee[j+1]=employee[j];
				//System.out.println("heyy"+j);
			}
			employee[j+1]=temp;
			
		}
		
	}
	
	

}
