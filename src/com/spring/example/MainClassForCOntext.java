package com.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassForCOntext {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(
				"AppContext.xml");
		boolean containsBean = applicationContext.containsBean("c");
		System.out.println(containsBean);
	}
}
