 
/*
 *WAP to print the meaning of the specific color in traffic lights
 *
 */

import java.util.Scanner;

class Program01{
	public  static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the traffic color in Capital Letter : ");
		String color = ip.next();


		switch(color){
			case "RED" : System.out.println("STOP"); break;
			case "GREEN" : System.out.println("GO"); break;
			case "YELLOW" : System.out.println("READY TO GO"); break;
			default : System.out.println("Invalid signal color");
		}
	}
 
 }
