/*
 *
 *	Write a program to  check if there is vowel present in the arrayy of charcters , if present then print its index , take the inputs from teh user 
 *
 */

import java.util.Scanner;

class Program13{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = ip.nextInt();

		char arr[] = new char[size];

		System.out.println("Enter the "+ size + " characters ");
		for(int i = 0 ; i< arr.length ; i++){
			arr[i] = ip.next().charAt(0);
		}

		for(int i = 0 ; i < arr.length ; i++){

			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||  arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
				System.out.println( "vowel "+arr[i]+ " found which is at index "+ i );
			}
		}

	}	
}
