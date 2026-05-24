 
/*
 *WAP a program for the below example
 * if u like to watch movies and you are planning to buy the subscription  according to the plan
 * 	for the planinum plan , price is 799,
 * 	for the gold plan , price is 599,
 * 	for the silver plan, price is 399,
 * 	for thr bronze plan, price is 199,
 * 	for less than 199 , a platform is free with limitted access 
 *
 */

import java.util.Scanner;

class Program06{
	public  static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the plan no. that you want to get the movies subscription price :  ");
		System.out.println("1. Platinum \n 2. Gold \n 3. Silver \n 4. Bronze \n 5. Free");
		int moviePlanNo = ip.nextInt();


		switch(moviePlanNo){
			case 1 : System.out.println("For the planinum plan price is : 799"); break;
			case 2 : System.out.println("For the gold plan price is : 599"); break;
			case 3 : System.out.println("For the silver plan price is : 399"); break;
			case 4 : System.out.println("For the bronze plan price is : 199"); break;
			case 5 : System.out.println("A Platform is free with limited access."); break;		
			default : System.out.println("Invalid plan");
		}
	}
 
 }
