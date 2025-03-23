package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.model.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext ioc =new AnnotationConfigApplicationContext("spring.core");
		Employee bean1 = ioc.getBean(Employee.class);
		bean1.setName("Vikas");
		System.out.println(bean1);
		
	}

}
