package com.sr.pl;
import java.util.*;
import com.sr.entity.*;
import com.sr.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	HashMap<Integer,Employee> empMap=new HashMap<Integer,Employee>();

	@Override
	public void addEmployee(Employee emp) {
		empMap.put(emp.getId(), emp);		
	}

	@Override
	public boolean deleteEmployee(int id) {
		try {
			if(empMap.containsKey(id)) {
				empMap.remove(id);
				return true;
			}
		}
		catch(Exception e) {
			
		}
		return false;
	}

	@Override
	public String showEmpDetails(String insuranceScheme) {
		for(Map.Entry<Integer, Employee> mapEntry :empMap.entrySet()) {
			Employee obj = ((Employee) mapEntry.getValue());
			if(insuranceScheme.equals(obj.getInsuranceScheme(obj.getSalary()))) {
				return "Name: "+obj.getName()+" ID: "+obj.getId()+" Salary: "+obj.getSalary()+
						" Designation: "+obj.getDesignation()+" InsuranceSchemme: "+insuranceScheme;
			}
		}
		return null;
	}
}

