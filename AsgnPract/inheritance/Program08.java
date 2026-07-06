package com.inheritance;

import java.util.Scanner;

/*
 * Design a base class Event with eventName and location. Inherit a class SportsEvent that
 * adds sportType and a method to display full event info.
 */

import java.util.Scanner;

class Event{
	String eventName;
	String location;
}

class SportsEvent extends Event{
	String sportsType;
	
	SportsEvent(String eventName , String location , String sportsType){
		this.eventName = eventName;
		this.location = location;
		this.sportsType = sportsType;
	}
	
	void showDetails() {
		System.out.println("------------------------------------");
		System.out.println("Event Details : ");
		System.out.println("eventName : " +eventName);
		System.out.println("location : "+location );
		System.out.println("sportsType : "+sportsType);

	}
}


public class Program08 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Enter eventName : ");
        String eventName = ip.nextLine();
        
        System.out.print("Enter location : ");
        String location = ip.nextLine();
        
        System.out.print("Enter sportsType: ");
        String sportsType = ip.nextLine();
        
        SportsEvent se =new SportsEvent(eventName, location, sportsType);
        se.showDetails();
      }
}