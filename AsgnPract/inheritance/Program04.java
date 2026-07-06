package com.inheritance;


/*
 * Design a base class Vehicle with brand and model, and a derived class Car that adds price
 * and fuelType. Add methods to display both vehicle and car details.
 */

import java.util.Scanner;
class Vehicle{
	String brand;
	String model;
}
class Car extends Vehicle{
	double price;
	String fueltype;
	
	Car(double price , String fueltype , String brand , String model){
		this.price = price;
		this.fueltype = fueltype;
		this.brand = brand;
		this.model = model;
	}
	
	void showDetails() {
		System.out.println("---------------");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
		System.out.println("Fueltype : "+fueltype);
	}
	
	
}

public class Program04 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter brand : ");
		String brand = ip.next();
		System.out.println("Enter model : ");
		String model = ip.next();
		System.out.println("Enter price : ");	
		double price = ip.nextDouble();
		System.out.println("Enter fuelType : ");
		String fueltype = ip.next();
		
		Car c = new Car(price, fueltype, brand, model);
		c.showDetails();
	}

}
