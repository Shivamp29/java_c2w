package com.inheritance;


/*
 * Make a base class Shape with color. Create a derived class Rectangle with length and
 * breadth, and add a method to calculate area.
 */

import java.util.Scanner;

import java.util.Scanner;

class Shop{
	String color;
}

class Rectangle extends Shop{
	double length;
	double bredth;
	
	public Rectangle(double length ,  double breadth , String color) {
		this.bredth = breadth;
		this.length = length;
		this.color = color;
	}
	
	void calculateArea() {
		double area = length * bredth;
		System.out.println("Area of rectangle is : "+area);
	}
}


public class Program06 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Enter length : ");
        double length = ip.nextDouble();
        
        System.out.print("Enter breadth : ");
        double breadth = ip.nextDouble();
        
        System.out.print("Enter Color: ");
        String color = ip.next();
        
       Rectangle r = new Rectangle(length, breadth, color);
       r.calculateArea();
      }
}