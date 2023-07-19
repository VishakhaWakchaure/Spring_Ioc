package com.jsp.penvariable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {
	@Value(value = "Reynlods")
 String name;
	@Value(value = "Blue")
 String color;
	@Value(value = "10")
 double price;
 
 public void printDetailsPen() {
	 System.out.println(name);
     System.out.println(color);
     System.out.println(price);
 }
}
