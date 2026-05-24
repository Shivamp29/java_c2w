/*
 * WAP to print the even numbers from 1- N , where n is the give no.
 *
 */ 

import java.util.Scanner;

class Program04{
 	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = ip.nextInt();
		for(int i = 1; i <= n; i++){
			if(i %2 == 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}
 }
