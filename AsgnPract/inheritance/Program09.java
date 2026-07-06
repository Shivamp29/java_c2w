package com.inheritance;

import java.util.Scanner;

/*
 * Design a base class Artist with name and age. Inherit a class Musician that adds instrument
 * and a method perform().
 */

import java.util.Scanner;

class Artist{
	String name;
	int age;
}

class Musician extends Artist{
	String instrument;
	
	Musician(String name , int age , String instrument){
		this.name = name;
		this.age = age;
		this.instrument = instrument;
	}
	
	void perform() {
		System.out.println("------------------------------------");
		System.out.println("Perform Details : ");
		System.out.println("name : " +name);
		System.out.println("age : "+age );
		System.out.println("instrument : "+instrument);
	}
}


public class Program09 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        String name = ip.nextLine();
        
        System.out.print("Enter age : ");
        int age = ip.nextInt();
        
        ip.nextLine();

        System.out.print("Enter instrument: ");
        String instrument = ip.nextLine();
        
        Musician m =new Musician(name, age, instrument);
        m.perform();
      }
}