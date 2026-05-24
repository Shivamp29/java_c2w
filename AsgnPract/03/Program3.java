
/*
 * WAP to check  whether the given no is less than 10 or greater thean 10 
 *
 */

import java.util.*;

class CheckLessOrGreaterThan10{
	public static void main(String[] args ){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no to check less or greater than 10 : ");
		int x = ip.nextInt();

		if(x > 10 ){
			System.out.println(x + " is Greater than 10 ");
		}	
		else if(x < 10 ){
			System.out.println(x + " is Less Than 10 ");
		}
		else{
			System.out.println( x +" is Equal to  10");
		}
	}
}
