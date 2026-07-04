/*
 *
 *	Write a program where u have to count the vene numbers in an array , take the size and elements from teh user ,  ans also print even numbers too
 *
 */

import java.util.Scanner;

class Program11{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = ip.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the "+ size + " elements : ");
		for(int i = 0 ; i< arr.length ; i++){
			arr[i] = ip.nextInt();
		}

		int count = 0;
		for(int i = 0 ; i < arr.length ; i++){

			if(arr[i] % 2 == 0){
				System.out.println( arr[i] + " is even no.");
				count++;
			}
		}

		System.out.println("totla counts of the even no in the give array is : "+count);

	}	
}
