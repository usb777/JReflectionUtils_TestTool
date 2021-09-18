package com.model.jreflect;

public class Employee {
	private int id;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private String name;
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test12");
	}
	
	
	private String toStringEmpl()
	{
		return "Employee id = "+this.id+ " Employee name ="+this.name;
	}

	
	private String toStringEmplParam(int id1, String name1)
	{
		return "Employee id = "+id1+ " Employee name ="+name1;
	}
}
