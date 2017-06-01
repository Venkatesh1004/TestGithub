package com.easylearnjava.withspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Enterprise {
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/easylearnjava/withspring/spring-beans.xml");
		Vehicle vehicle = (Vehicle) appContext.getBean("VehicleObj");

		

		vehicle.rent();
		vehicle.paint();
	}

}
