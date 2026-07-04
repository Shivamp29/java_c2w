/*
 *
 *	Write a real time example where you have to use the array , take the inputs from user
 *
 */

import java.util.Scanner;

class Program10{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter no of students : ");
		int studCount = ip.nextInt();

		int arr[] = new int[studCount];

		System.out.println("Enter the "+ studCount + " students roll no. ");
		for(int i = 0 ; i< arr.length ; i++){
			arr[i] = ip.nextInt();
		}

		System.out.println(" Student roll no are : ");

		for(int i = 0 ; i < arr.length ; i++){
			System.out.println( "student "+ i + " roll no is " + arr[i] );
		}
	}	
}
