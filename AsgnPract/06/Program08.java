/*
 * WAP to print the the revernse table of N , where N is the given number
 *
 */ 

import java.util.Scanner;

class Program08{
 	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number  to get its reverse table: ");
		int n = ip.nextInt();
		for(int i = 10 ; i >= 1 ; i--){
			System.out.print(i * n + " ");
		}
		System.out.println();
	}
 }
