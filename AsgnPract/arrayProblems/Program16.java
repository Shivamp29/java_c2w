/*
 *
 *	Write a program to print the products of the odd indexed elements , take the inputs from the user
 *
 */

import java.util.Scanner;

class Program16{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = ip.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the "+ size + " elements : ");
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = ip.nextInt();
		}

		int product = 1;
		for(int i = 0 ; i < arr.length ; i++){

			if(i % 2 != 0 ){
				product *= arr[i];
			}
		}

		System.out.println("Product of odd indexed elements is : "+product);

	}	
}
