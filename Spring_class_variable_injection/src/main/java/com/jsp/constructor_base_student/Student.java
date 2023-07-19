package com.jsp.constructor_base_student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {       //pojo class (private class)
int id;
String name;
String email;

//contructor
Student(@Value(value = "101") int id, 
		@Value(value = "Vishakha") String name,
		 @Value(value = "vishakha@23334") String email) {
	this.id=id;
	this.name=name;
	this.email=email;
}
//to print
public void printStudent() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(email);
}

}
