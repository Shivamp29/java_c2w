/*
 *
 *	Write a program to print the maximum elements of an array , take the inputs from the user
 *
 */

import java.util.Scanner;

class Program20{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = ip.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the "+ size + " elements : ");
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = ip.nextInt();
		}

		int max = arr[0];
		for(int i = 0 ; i < arr.length ; i++){

			if( arr[i] > max ){
				max = arr[i];
			}
		}

		System.out.println("max element of array is  : "+max);

	}	
}
