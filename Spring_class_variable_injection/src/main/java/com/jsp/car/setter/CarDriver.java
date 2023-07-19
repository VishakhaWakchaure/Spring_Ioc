package com.jsp.car.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.jsp.configration.MyConfig;

public class CarDriver {
	
public static void main(String[] args) {
	
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	
	Car car=(Car)applicationContext.getBean("car");
	
	car.printDetailsCar();
	
}
}
