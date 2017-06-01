package com.easylearnjava.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddressTest {
public static void main(String[] args) {
	
	ApplicationContext appcontext = new ClassPathXmlApplicationContext("com/easylearnjava/constructorinjection/spring-beans.xml");
	AddressDemo adrs = (AddressDemo)appcontext.getBean("addObj");
	System.out.println("The address line 1 is : "+ adrs.getAddressline1());
	System.out.println("the address line 2 is : " + adrs.getAddressline2());	
	System.out.println("the city name is :" + adrs.getCity());
	System.out.println("The state is :" + adrs.getState());
	System.out.println("the zip code is:" + adrs.getZip());
}
}
