package com.jsp.pen;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;

public class PenDriver {
public static void main(String[] args) {
	
	//call by using bean factory
	/*
	 * ClassPathResource classPathResource=new ClassPathResource("MySpring.xml");
	 * 
	 * BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
	 * 
	 * //downcasting
	 *  Pen pen= (Pen)beanFactory.getBean("myPen");
	 */
	
	 //Call by using Application context
	 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("MySpring.xml");
	 Pen p = (Pen)applicationContext.getBean("myPen");
	p.write();
}
}


