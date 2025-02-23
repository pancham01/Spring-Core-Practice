package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.model.Employee;

public class App {

	public static void main(String[] args) {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee bean = ioc.getBean(Employee.class, "emp");
		
		System.out.println(bean);
	}

}
