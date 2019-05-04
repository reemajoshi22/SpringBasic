package com.spring.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

//@Component uncommenbt this if useing component scan in the appcontext xml
@XmlRootElement
@XmlAccessorType(value=XmlAccessType.FIELD)
public class Employee extends InheritenceExample implements SmartLifecycle//, ApplicationContextAware
{
	
	//ApplicationContext applicationContext; use this if we implement ApplicationContextAware
	public Employee() {

	}
	
	
	public Employee(EmployeeDetails details, int emp_id, String emp_name,
			String employee_dept, Float employee_salary) {
		super();
		this.details = details;
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.employee_dept = employee_dept;
		this.employee_salary = employee_salary;
		//applicationContext.getBean("details");
	}
	@Autowired
	@XmlElement
	EmployeeDetails details;

	public Employee(EmployeeDetails details) {
		this.details = details;
	}

	 @XmlAttribute(name="id")
	int emp_id;
	 @XmlAttribute
	String emp_name;
	 @XmlAttribute
	String employee_dept;
	 @XmlAttribute
	Float employee_salary;

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

	public void print() {
		System.out.println("employee id is " + emp_id + "\n employee name is"
				+ emp_name + "\n employee department is" + employee_dept
				+ "\n employee salary is" + employee_salary
				+ "employee age is " + details.age + "\n employee sex is"
				+ details.sex+"type is"+getType());

	}

	// @XmlAttribute
	public int getEmp_id() {
		return emp_id;
	}

	// @XmlAttribute
	public String getEmp_name() {
		return emp_name;
	}

	// @XmlAttribute
	public String getEmployee_dept() {
		return employee_dept;
	}

	// @XmlAttribute
	public Float getEmployee_salary() {
		return employee_salary;
	}

	public void setDetails(EmployeeDetails details) {
		this.details = details;
	}

	@Override
	public boolean isRunning() {
		return true;
	}

	@Override
	public void start() {
		System.out.println("server start method");		
	}

	@Override
	public void stop() {
		System.out.println("server stop method");		
	}

	@Override
	public int getPhase() {
		System.out.println("server getPhase method");	
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		System.out.println("server auto autostartup method");	
		return false;
	}

	@Override
	public void stop(Runnable arg0) {
		System.out.println("stop method");
	}


	/*@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.applicationContext=arg0;
		
		
	}*/

}
