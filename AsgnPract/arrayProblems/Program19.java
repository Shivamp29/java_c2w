/*
 *
 *	Write a program to print the minimus elements of an array , take the inputs from the user
 *
 */

import java.util.Scanner;

class Program19{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = ip.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the "+ size + " elements : ");
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = ip.nextInt();
		}

		int min = arr[0];
		for(int i = 0 ; i < arr.length ; i++){

			if( arr[i] < min ){
				min = arr[i];
			}
		}

		System.out.println("min element of array is  : "+min);

	}	
}
