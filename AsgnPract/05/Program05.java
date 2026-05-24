 
/*
 *WAP that takes the numbers from 0 to 5 and prints ites spellings if the entered no is greater than 5 prints entered no is greater than 5
 *
 */

import java.util.Scanner;

class Program05{
	public  static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter numbers from 0 to 5 to get its spelling  : ");
		int num = ip.nextInt();


		switch(num){
			case 0 : System.out.println("Zero"); break;
			case 1 : System.out.println("One"); break;
			case 2 : System.out.println("Two"); break;
			case 3 : System.out.println("Three"); break;
			case 4 : System.out.println("Four"); break;
			case 5 : System.out.println("Five"); break;		 
			default : System.out.println("Entered no is greater than 5");
		}
	}
 
 }
