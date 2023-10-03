package com.sr.entity;

public class Employee {
	int id;
	String name;
	double salary;
	String designation;
	String insuranceScheme;
	
	public Employee() {
		
	}
	public Employee(int id,String name,double salary,String designation) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	public String getInsuranceScheme(double salary) {
		if(salary>5000 && salary<20000) {
			String result="Scheme C";
			this.setInsuranceScheme(result);
			return result;
		}
		if(salary>=20000 && salary<40000) {
			String result="Scheme B";
			this.setInsuranceScheme(result);
			return result;
		}
		if(salary>=40000) {
			String result="Scheme A";
			this.setInsuranceScheme(result);
			return result;
		}
		if(salary<5000) {
			String result="No Scheme";
			this.setInsuranceScheme(result);
			return result;
		}
		return null;
	}

}
