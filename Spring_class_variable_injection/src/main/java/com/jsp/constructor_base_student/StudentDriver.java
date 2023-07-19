package com.jsp.constructor_base_student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.jsp.configration.MyConfig;
public class StudentDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	Student student=(Student)applicationContext.getBean("student");   //pojoclass name class always small leter
	student.printStudent();      //calling the method his method present in Student class
}
}
