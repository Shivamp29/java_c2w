package com.inheritance;

import java.util.Scanner;

/*
 * Create a class Transport with mode and maxSpeed. Inherit Bus with routeNo and
 * seatCount, and method to show route details
 */

import java.util.Scanner;

class Transport{
	String mode;
	int maxSpeed;
}

class Bus extends Transport{
	int routeNo;
	int seatCount;

	Bus(String mode ,int maxSpeed , int routeNo , int seatCount){
		this.mode = mode;
		this.maxSpeed = maxSpeed;
		this.routeNo = routeNo;
		this.seatCount = seatCount;
	}
	
	void showDetails() {
		System.out.println("------------------------------------");
		System.out.println("Route Details : ");
		System.out.println("mode : " +mode);
		System.out.println("routeNo : "+routeNo );
		System.out.println("maxSpeed : "+maxSpeed);
		System.out.println("seatCount : "+seatCount);
	}
}


public class Program10 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Enter mode : ");
        String mode = ip.nextLine();
        
        System.out.print("Enter routeNo : ");
        int routeNo = ip.nextInt();
        
        ip.nextLine();

        System.out.print("Enter maxSpeed: ");
        int maxSpeed = ip.nextInt();
        
        System.out.print("Enter seatCount: ");
        int seatCount = ip.nextInt();

        Bus b = new Bus(mode, maxSpeed, routeNo, seatCount);
        b.showDetails();
      }
}