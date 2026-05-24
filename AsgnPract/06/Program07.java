/*
 * WAP to print the the table of N , where N is the given number
 *
 */ 

import java.util.Scanner;

class Program07{
 	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number  to get its table: ");
		int n = ip.nextInt();
		for(int i = 1 ; i <= 10 ; i++){
			System.out.print(i * n + " ");
		}
		System.out.println();
	}
 }
