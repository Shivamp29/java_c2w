/*
 *
 *	Write a program to search an element in an array and return its index , ask the user to provide the number ,  take the user inputs
 *
 */

import java.util.Scanner;

class Program14{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = ip.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the "+ size + " elements : ");
		for(int i = 0 ; i< arr.length ; i++){
			arr[i] = ip.nextInt();
		}

		System.out.println("Enter  the element to search : ");
		int searchEle = ip.nextInt();
		boolean flag = false;
		int index = -1;
		for(int i = 0 ; i < arr.length ; i++){

			if(arr[i] ==  searchEle){
				flag = true;
				index = i;
				break;
			}
		}

		System.out.println( flag == true ? searchEle + " Found at index " + index : " search element not found");

	}	
}
