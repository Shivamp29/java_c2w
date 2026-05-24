/*
 * WAP to print  the sum of first N natural numbers , where N is the given number
 *
 */ 

import java.util.Scanner;

class Program09{
 	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the N'th natural number to get its sum : ");
		int n = ip.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= n ; i++){
			sum = sum + i ;
		}
		System.out.println("Sum of "+ n +" natural no is : " + sum);
	}
 }
