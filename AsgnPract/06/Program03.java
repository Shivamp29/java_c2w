/*
 * WAP to print the first N 3 digit numbers , where n is the give no.
 *
 */ 

import java.util.Scanner;

class Program03{
 	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = ip.nextInt();
		for(int i = 100; i < 100 + n; i++){
			System.out.print(i + " ");
		}
		System.out.println();
	}
 }
