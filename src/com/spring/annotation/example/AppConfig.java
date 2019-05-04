package com.spring.annotation.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan(basePackages = "com.spring.annotation")
@PropertySource(value = "file:///E:/ReemaJoshi/Java/SpringBasic/src/AnnotationApplication.properties")
public class AppConfig {

	/*
	 * @Autowired static Environment env; // for propertyplaceholderconfigurer
	 */
	// @Bean(name="employee")
	public Employee getEmployee() {
		/*
		 * Employee employee=new Employee();
		 * employee.setEmp_name(env.getProperty("ANNO.EMP.NAME"));
		 */
		return new Employee();
	}

	// static bean instatintion of PropertyPlaceholderConfigurer
	@Bean
	public static PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer() {
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
		configurer.setLocation(new ClassPathResource(
				"AnnotationApplication.properties"));
		return configurer;

	}

	@Bean(name = "details")
	// using this cz we are setting properties explicitly
	public EmployeeDetails getEmployeeDetails() {
		EmployeeDetails details = new EmployeeDetails();
		details.setAge(99);
		details.setSex("m");
		return details;
	}

}
