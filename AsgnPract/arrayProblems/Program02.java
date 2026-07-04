/*
 *
 *	Take the input from the user where the size of the array is 10 and print the output of the user given elements of an array 
 *
 */

import java.util.Scanner;

class Program02{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println("Eneter the 10 elements : ");
		for(int i = 0 ; i< arr.length ; i++){
			arr[i] = ip.nextInt();
		}
		System.out.println("Array elements are : ");

		for(int i = 0 ; i <= arr.length - 1 ; i++){
			System.out.println(arr[i]);
		}
	}	
}
