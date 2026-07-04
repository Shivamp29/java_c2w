/*
 *
 *	Write a program to print the sum of the odd indexed elements , take the inputs from the user
 *
 */

import java.util.Scanner;

class Program15{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = ip.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the "+ size + " elements : ");
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = ip.nextInt();
		}

		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++){

			if(i % 2 != 0 ){
				sum += arr[i];
			}
		}

		System.out.println("Sum of odd indexed elements is : "+sum);

	}	
}
