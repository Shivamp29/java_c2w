/*
 *
 *	Write a program to print the elements of an array which are greater than 5 and less than 9 , take the inputs from teh user
 *
 */

import java.util.Scanner;

class Program18{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = ip.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the "+ size + " elements : ");
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = ip.nextInt();
		}

		for(int i = 0 ; i < arr.length ; i++){

			if( arr[i] >= 5 && arr[i] < 9 ){
				System.out.println(arr[i] + " is greater than 5 and less than 9");
			}
		}

	}
}
