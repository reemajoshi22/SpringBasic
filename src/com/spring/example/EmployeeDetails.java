package com.spring.example;

import javax.xml.bind.annotation.XmlElement;

public class EmployeeDetails {


	@XmlElement
	int age;
	@XmlElement
	String sex;

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
