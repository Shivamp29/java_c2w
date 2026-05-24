
/*
 * WAP to check  whether the given no is even or odd 
 *
 */

import java.util.*;

class CheckEvenOdd{
	public static void main(String[] args ){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no to check the even or odd : ");
		int x = ip.nextInt();

		if(x % 2 == 0 ){
			System.out.println(x + " is even ");
		}	
		else {
			System.out.println(x + " is odd ");
		}
	}
}
