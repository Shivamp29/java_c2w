
/*
 * WAP to check  whether the given no is divisible by 7 or not 
 *
 */

import java.util.*;

class Program7{
	public static void main(String[] args ){
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter No to check is divisible  7 or not : ");
		int num = ip.nextInt();

		if(num % 7 == 0){
			System.out.println(num + " is Divisible by 7");
		}
		else{
			System.out.println(num + " is not  Divisible by 7");
		}
	
	}
}
