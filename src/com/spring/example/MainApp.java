package com.spring.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"AppContext.xml");
		/*Employee employee = (Employee) applicationContext.getBean("employee");
		employee.print();
		try {
			JAXBContext contextObj = JAXBContext.newInstance(Employee.class);
			Marshaller marshallerObj = contextObj.createMarshaller();
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshallerObj.marshal(employee, System.out);

			// System.out.println(marshallerObj);
		} catch (JAXBException e) {
			e.printStackTrace();
		}*/
		
		X x = (X) applicationContext.getBean("x");
		x.display();
	}
}
