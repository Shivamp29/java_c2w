 
/*
 *WAP to print long form of the cloth sizes according to their accronyms
 *
 */

import java.util.Scanner;

class Program03{
	public  static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter cloth size acronyms : ");
		String size = ip.next();


		switch(size){
			case "S" : System.out.println("Short"); break;
			case "M" : System.out.println("Medium"); break;
			case "L" : System.out.println("Long"); break;
			case "XL" : System.out.println("Extra Long"); break;
			case "XXL" : System.out.println("Extra Extra Long"); break;
						    
			default : System.out.println("Invalid size");
		}
	}
 
 }
