/*
 * WAP to print count of odd Numbers from 1 to N , where N is the given number
 *
 */ 

import java.util.Scanner;

class Program10{
 	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the N'th natural number to get odd numbers : ");
		int n = ip.nextInt();
		int count = 0;
		for(int i = 1 ; i <= n ; i++){
			if(i % 2 != 0)
				count++;
		}
		System.out.println("Total odd numbers from 1 to "+ n + " is : " + count);
	}
 }
