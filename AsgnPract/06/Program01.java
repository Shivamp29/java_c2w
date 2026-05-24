/*
 * WAP to print the first n natural numbers , where n is the give no.
 *
 */ 

import java.util.Scanner;

class Program01{
 	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = ip.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.print(i + " ");
		}
		System.out.println();
	}
 }
