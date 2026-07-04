/*
 *
 *	WAP where u have to take the  inputs from teh user for a chracter array and prints the characters 
 *
 */

import java.util.Scanner;

class Program06{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		char arr[] = new char[5];

		System.out.println("Enter the 5 chars : ");
		for( int i = 0 ; i < arr.length ; i++){
			arr[i] = ip.next().charAt(0);
		}
		
		System.out.println("Array elements are : ");

		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}	
}
