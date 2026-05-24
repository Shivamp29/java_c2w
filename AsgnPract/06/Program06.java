/*
 * WAP to print the reverse numbers from N -10, where n is the give no.
 *
 */ 

import java.util.Scanner;

class Program06{
 	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = ip.nextInt();
		for(int i = n; i >= 10 ; i--){
			System.out.print(i + " ");
		}
		System.out.println();
	}
 }
