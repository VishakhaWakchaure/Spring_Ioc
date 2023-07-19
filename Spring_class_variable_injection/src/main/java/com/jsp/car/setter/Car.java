package com.jsp.car.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component     //component are help to com.jsp is put in component scan
public class Car {
   String name;
  String color;
  double price;
public String getName() {
	return name;
}
@Value(value = "BMW")
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
@Value(value = "Black")
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
@Value(value = "2000000")
public void setPrice(double price) {
	this.price = price;
}
 

public void printDetailsCar(){
	 System.out.println(name);
    System.out.println(color);
    System.out.println(price);
}
}
