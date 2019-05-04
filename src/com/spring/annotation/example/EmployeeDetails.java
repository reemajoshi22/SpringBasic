package com.spring.annotation.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component // commented out @component cz it is already defined woth @bean in appconfig
//@Profile("dev")
public class EmployeeDetails {
	
	@Value(value = "1")
	int age;
	
	@Value(value = "f")
	String sex;

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
