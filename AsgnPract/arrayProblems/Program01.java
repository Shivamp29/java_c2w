/*
 *
 *	WAP to print the array with minimum 10 elements data
 *
 *	ex : 10 , 20, 30, 40, 50, 60,  70, 80, 90, 100
 *
 *
 */

import java.util.Scanner;

class Program01{
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50,60,70,80,90,100};

		System.out.println("Array elements are : ");

		for(int i = 0 ; i <= arr.length - 1 ; i++){
			System.out.println(arr[i]);
		}
	}	
}
