 
/*
 *WAP a program that takes the two numbrs from the users , if both the numbers are positive then multiply  them and provide the swithc case to  verify whether the calculated number is 
 * even or odd , if user enters any negative number the program should terminate by saying 'Sorry negative numbers are not allowed"
 *
 */

import java.util.Scanner;

class Program07{
	public  static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		System.out.print("Number 1 :");
		int num1 = ip.nextInt();
		System.out.print("Number 2 :");
                int num2 = ip.nextInt();

		if(num1 < 0 || num2 < 0 ){
			System.out.println("Sorry negative numbers are not allowed..!");
		}
		else if(num1 > 0 && num2 > 0){
			int res = (num1 * num2 ) % 2;
			switch(res){
				case 0 : System.out.println("Multiplicaion res of "+num1+" AND "+ num2 +" is even."); break;
				default: System.out.println("Multiplicaion res of "+num1+" AND "+ num2 +" is odd.");
			}
		}else{
			System.out.println("Invalid Number");
		}
	}
}

