package com.aztha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Employeebean.xml");
		
		Employee e1= (Employee)context.getBean("emp1");
		
		System.out.println("Employee details: "+e1);

	}

}
