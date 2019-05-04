package com.spring.annotation.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		//applicationContext.getEnvironment().setActiveProfiles("dev");
	
		Employee employee = (Employee) applicationContext.getBean("employee");
		
		employee.print();
	}
}
