package com.spring.example;

public class EmployeeFactory {
	
	public EmployeeFactory() {
	}

	public static Employee createEmplaoyee(String name){
		Employee employee=new Employee();
		EmployeeDetails details=new EmployeeDetails();
		if("reema".equals(name)){
			employee.setEmp_id(1);
			employee.setEmp_name("reema the queen");
			employee.setEmployee_dept("cse");
			employee.setEmployee_salary(100.00f);
			details.setAge(20);
			details.setSex("f");
			employee.setDetails(details);
			
		}
		return employee;
		
	}
}
