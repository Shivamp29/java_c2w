/*
 * 
 * WAP to check whether the student passed with ,
 * first class with destinction , first class , second class , pass , fail 
 *
 * */
import java.util.Scanner;

class Program08{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter marks obtained by the sutdent :");
		double marks = ip.nextDouble();
		
		if(marks >= 85.0 ){
			System.out.println("First class with destinction.");
		}
		else if(marks >= 70.0 && marks <= 84.0){
			System.out.println("First class.");
		}
		else if(marks >= 50.0 && marks <= 69.0){
			System.out.println("Second class.");
		}
		else if(marks >= 35.0 && marks <= 49.0){
			System.out.println("Pass");
		}
		else{
			System.out.println("Failed");
		}

	}
}
