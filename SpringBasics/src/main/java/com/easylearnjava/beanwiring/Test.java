package com.easylearnjava.beanwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/easylearnjava/beanwiring/spring-beans.xml");
		Student std =  (Student)appContext.getBean("studentobj");
		System.out.println("the name of the student is:" + std.getStdName());
		System.out.println("the book is :" + std.getMyBook());
		
		System.out.println("Book name:" + std.getMyBook(). getBkName());
		
		Car car= (Car)appContext.getBean("carObj");
		System.out.println("Wheel Name is:" + car.getMyWheel().getWheelName());
		
		College colg = (College)appContext.getBean("clgobj");
		System.out.println("student name is: " + colg.getStudent().getStdName());
		
	}

}
