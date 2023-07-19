package com.jsp.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarDriver {
public static void main(String[] args) {
ApplicationContext applicationContext=new AnnotationConfigApplicationContext( MyConfig.class);

applicationContext.getBean("car");
}
}
