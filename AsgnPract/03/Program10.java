
/*
 * WAP to the day number(1-7) and print the corresponding day of the week  
 *
 */

import java.util.*;

class Program10{
	public static void main(String[] args ){
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter day number : ");
		int dayNo = ip.nextInt();
		
		switch(dayNo){
			case 1 :
				System.out.println("Sunday"); break;
			case 2 :
                                System.out.println("Monday"); break;
			case 3 :
                                System.out.println("Tuesday"); break;
			case 4 :
                                System.out.println("Wedensday"); break;
			case 5 :
                                System.out.println("Thursday"); break;
			case 6 :
                                System.out.println("Friday"); break;
			case 7 :
                                System.out.println("Saturday"); break;
			default :
                                System.out.println("Day number must be between the 0 to 7..!!"); break;
		}
		
	}
}
