/*
 *
 *	Write a program to take teh numbers from the user in a 2d array and print the array
 *
 */

import java.util.Scanner;

class Program21{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter row :");
		int row = ip.nextInt();
		System.out.println("Enter column :");
                int col = ip.nextInt();


		int arr[][] = new int[row][col];

		System.out.println("Enter the "+ row + " * " col + " elements : ");
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
