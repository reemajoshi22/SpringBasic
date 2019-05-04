package com.spring.annotation.example;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
/*@Service
@Controller
@Repository*/
@Component // this is generic stereo type for the @service @controller @reppsitory
//@Profile("dev")
// for defing this class will participate in bean instantion due to component
// scan- no need to explicilty do return new in app config if using @component

// ignoreResourceNotFound=true this  doesnt throws filenot found exception if the property file not found
public class Employee {

	//@Value(value = "123")
	@Value("${ANNO.EMP.ID}")
	int emp_id;

	@Value(value="${ANNO.EMP.NAME}")
	//@Value("${unknown.param:some default}")
	String emp_name;
	String employee_dept;
	Float employee_salary;

	//@Resource
	EmployeeDetails details;

	// @Required
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public void setEmployee_dept(String employee_dept) {
		this.employee_dept = employee_dept;
	}

	public void setEmployee_salary(Float employee_salary) {
		this.employee_salary = employee_salary;
	}

	// @Required
	@Autowired
	// @Primary
	// @Qualifier("details")
	//@Resource(name = "details") // comment @resource if using autowired both are similar
	public void setDetails(EmployeeDetails details) {
		this.details = details;
	}

	public void print() {
		System.out.println("employee id is " + emp_id + "\n employee name is"
				+ emp_name + "\n employee department is" + employee_dept
				+ "\n employee salary is" + employee_salary
				+ "employee age is " + details.age + "\n employee sex is"
				+ details.sex);

	}

}
