/*
 *
 *	Write a program to print the elements of the array which are divisible by 4 , take the input from the user
 *
 */

import java.util.Scanner;

class Program07{
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

			if(arr[i] % 4 == 0)
				System.out.println(arr[i]+" is divisible by 4" + " and its index is : "+ i );
		}
	}	
}
