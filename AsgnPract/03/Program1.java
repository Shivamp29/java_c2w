
/*
 * WAP to check  where the given no is positiv , negative or zero 
 *
 */

import java.util.*;

class CheckPositiveNegativeZeroNo{
	public static void main(String[] args ){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no to check the +ve , _ve or Zero : ");
		int x = ip.nextInt();

		if(x > 0 ){
			System.out.println(x + " is positive ");
		}	
		else if(x < 0 ){
                        System.out.println(x + " is negative ");
                }
		else{
			System.out.println(x + " is zero ");
		}
	}
}
