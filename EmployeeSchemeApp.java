package com.sr.client;
import com.sr.entity.Employee;
import com.sr.pl.*;

public class EmployeeSchemeApp {

	public static void main(String[] args) {
		Employee em1=new Employee(1,"Hari",65000,"Manager");
		Employee em2=new Employee(2,"Siri",37000.50,"Programmer");
		Employee em3=new Employee(3,"Abhi",19500,"System Associate");
		Employee em4=new Employee(4,"Mahi",4500,"Clerk");
		
		EmployeeServiceImpl esi=new EmployeeServiceImpl();
		esi.addEmployee(em1);
		esi.addEmployee(em2);
		esi.addEmployee(em3);
		esi.addEmployee(em4);
		
		System.out.println(esi.showEmpDetails(em1.getInsuranceScheme(em1.getSalary())));
		System.out.println(esi.showEmpDetails(em1.getInsuranceScheme(em2.getSalary())));
		System.out.println(esi.showEmpDetails(em1.getInsuranceScheme(em3.getSalary())));
		System.out.println(esi.showEmpDetails(em1.getInsuranceScheme(em4.getSalary())));
	}
}
