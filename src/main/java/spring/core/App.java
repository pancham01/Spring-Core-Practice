package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.model.Employee;

public class App {

	public static void main(String[] args) {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee bean1 = ioc.getBean("emp",Employee.class);
//		Employee bean2 = ioc.getBean("emp2",Employee.class);
		
		System.out.println(bean1);
//		System.out.println(bean2);
		
		
		
		
		
		
		
//		bean1.getAddress().setCity("GZB");
//		bean1.getAddress().setState("Noida");
//		System.out.println(bean1);

	}

}
