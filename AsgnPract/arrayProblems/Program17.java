/*
 *
 *	Write a program to print the array, if the user entered size is even then print the alternative array elements and also print all the array elements
 *
 */

import java.util.Scanner;

class Program17{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = ip.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the "+ size + " elements : ");
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = ip.nextInt();
		}

		System.out.println("Elements are : ");
		for(int i = 0 ; i < arr.length ; i++){

			if(size % 2 == 0 ){
				if(i % 2 == 0 ){
					System.out.println(arr[i]);
				}
			}
			else{
				System.out.println(arr[i]);
			}
		}
	}	
}
