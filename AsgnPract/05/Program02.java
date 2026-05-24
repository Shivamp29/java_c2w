 
/*
 *WAP to print remarks according to respective grades
 *
 */

import java.util.Scanner;

class Program02{
	public  static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your grade ");
		String grade = ip.next();


		switch(grade){
			case "O" : System.out.println("Outstanding"); break;
			case "A+" : System.out.println("Excellent"); break;
			case "A" : System.out.println("Very Good"); break;
			case "B+" : System.out.println("Good"); break;
			 case "C" : System.out.println("Average"); break;
			 case "P" : System.out.println("Pass"); break;
			 case "F" : System.out.println("Failed"); break;
				    
			default : System.out.println("Invalid grade");
		}
	}
 
 }
