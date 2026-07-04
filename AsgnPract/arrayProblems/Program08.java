/*
 *
 *	Write a program to where u have to store the employees age working at a company , take the count of employee from the user , take the  input from teh user
 *
 */

import java.util.Scanner;

class Program08{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter count of employee : ");
		int size = ip.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the "+ size + " employee ages :  ");
		for(int i = 0 ; i< arr.length ; i++){
			arr[i] = ip.nextInt();
		}

		for(int i = 0 ; i < arr.length ; i++){

				System.out.println("employee "+ i + " age is " + arr[i] );
		}
	}	
}
