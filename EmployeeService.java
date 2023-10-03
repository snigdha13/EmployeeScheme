package com.sr.service;
import com.sr.entity.Employee;

public interface EmployeeService {
	public void addEmployee(Employee emp);
	public boolean deleteEmployee(int id);
	public String showEmpDetails(String insuranceScheme);
}
