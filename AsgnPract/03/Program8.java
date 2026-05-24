
/*
 * WAP to check  whether the given no is divisible by 2 , 5 & 10 or not ,
 * if not then  print  'Not Divisible by 2 , 5 & 10' 
 *
 */

import java.util.*;

class Program8{
	public static void main(String[] args ){
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter No to check is divisible  2, 5, & 10 or not : ");
		int num = ip.nextInt();

		if(num % 2 == 0 && num % 5 == 0 && num % 10 == 0){
			System.out.println(num + " is Divisible by 2 , 5, & 10");
		}
		else{
			System.out.println(num + " is not  Divisible by 2 ,5 & 10 ");
		}
	
	}
}
