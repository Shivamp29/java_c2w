/*
 *
 *	Write a program where u have to print the odd indexed elements take the input from the user
 *
 */

import java.util.Scanner;

class Program09{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = ip.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the "+ size + " elements : ");
		for(int i = 0 ; i< arr.length ; i++){
			arr[i] = ip.nextInt();
		}

		for(int i = 0 ; i < arr.length ; i++){

			if( i % 2 != 0 ) {
				System.out.println(arr[i] + " is odd indexed element" );
			}
		}
	}	
}
