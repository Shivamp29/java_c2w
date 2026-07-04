/*
 *
 *	Write a program to print the sum of elements divisible by 3 in array , take the inputs from user
 *
 */

import java.util.Scanner;

class Program12{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = ip.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the "+ size + " elements : ");
		for(int i = 0 ; i< arr.length ; i++){
			arr[i] = ip.nextInt();
		}

		int sum = 0;
		System.out.println("Elements divisible by 3 are : ");
		for(int i = 0 ; i < arr.length ; i++){

			if(arr[i] % 3 == 0){
				System.out.println(arr[i]);
				sum += arr[i];
			}
		}

		System.out.println("sum of elements divisible by 3 are : "+ sum);

	}	
}
