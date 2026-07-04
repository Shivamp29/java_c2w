/*
 *
 *	write the program to print the even elements of an array , take th euser input  
 *
 */

import java.util.Scanner;

class Program03{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println("Eneter the 10 elements : ");
		for(int i = 0 ; i< arr.length ; i++){
			arr[i] = ip.nextInt();
		}
		System.out.println("Array even elements are : ");

		for(int i = 0 ; i <= arr.length - 1 ; i++){

			if( arr[i] % 2 == 0)
				System.out.println(arr[i]);
		}
	}	
}
