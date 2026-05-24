
/*
 * WAP to find the maximum no between two give no 
 *
 */

import java.util.*;

class Program9{
	public static void main(String[] args ){
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter num 1 : ");
		int num1 = ip.nextInt();
		System.out.println("Enter num 2 : ");
		int num2 = ip.nextInt();

		if(num1 > num2){
			System.out.println(num1 + " is maximum ");
		}
		else if (num2 > num1 ){
			System.out.println(num2 + " is maximum ");
		}
		else{
			System.out.println("Both numbers are equal ");
					
		}
	
	}
}
