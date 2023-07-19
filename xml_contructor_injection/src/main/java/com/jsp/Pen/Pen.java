package com.jsp.Pen;

public class Pen {
    private   String name;
     private  String color;
     private double price;

Pen(String name,String color,double price){
	this.name=name;
	this.color=color;
	this.price=price;
}

public void printDetailsPen() {
	System.out.println(name);
	System.out.println(color);
	System.out.println(price);
}
}
