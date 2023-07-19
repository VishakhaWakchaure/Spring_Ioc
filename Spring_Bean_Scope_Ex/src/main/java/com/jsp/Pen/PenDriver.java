package com.jsp.Pen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("MySpring.xml");
	Pen pen=(Pen)applicationContext.getBean("myPen");
	Pen pen2=(Pen)applicationContext.getBean("myPen");
	pen.printDetals();
	pen.setMassage("hello");
	System.out.println(pen.getMassage());
	System.out.println(pen2.getMassage());
}
}
