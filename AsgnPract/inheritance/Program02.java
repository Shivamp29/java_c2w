package com.inheritance;


/*
 * Make a class FlightTicket that initializes ticketNo, passengerName, and seatClass using
 * constructor. Add a method to calculate additional charges based on class.
 */

import java.util.Scanner;

class FlightTicket{
	int ticketNo;
	String passengerName;
	String seatClass;
	double baseCharge = 7000;
	
	FlightTicket(int ticketNo , String passengerName , String seatClass){
		this.ticketNo = ticketNo;
		this.passengerName = passengerName;
		this.seatClass = seatClass;
	}
	double calculateAdditinalCharges(String seatClass) {
			switch(seatClass) {
			case "enconomy" : return baseCharge + 2000;
			case "business" :  return baseCharge + 4000 ; 
			default : return  baseCharge;
		}
	}
	public void finalFlightCharge() {
		System.out.println("---------------------------------");
		System.out.println("Final ticket : ");
		System.out.println("ticketNo : "+ticketNo);
		System.out.println("seatClass : "+seatClass);
		System.out.println("passengerName  : "+passengerName);
		System.out.println("finalCharges  : "+calculateAdditinalCharges(seatClass));
	}
}

public class Program02 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter ticketNo : ");
		int ticketNo = ip.nextInt();
		System.out.println("Enter passenger name : ");
		String passName = ip.next();
		System.out.println("1. business , 2. Economy");
		System.out.println("select seat class ");
		String seatClass;
		int  seatClassId = ip.nextInt();
		switch(seatClassId) {
			case 1 : seatClass =  "enconomy"; break;
			case 2 : seatClass =  "business"; break;
			default : seatClass =  "invalid class";
		}
		FlightTicket inv = new FlightTicket(ticketNo , passName , seatClass);
		inv.finalFlightCharge();
	}

}
