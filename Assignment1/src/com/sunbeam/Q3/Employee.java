package com.sunbeam.Q3;

public class Employee {
	
	int empId;
	String name;
	
	public Employee()
	{
		
	}
	public Employee(int empId) {
		super();
		this.empId = empId;
		
	}
	public Employee(String name) {
		
		this.name = name;
	}
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	

}
