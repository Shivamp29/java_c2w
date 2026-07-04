/*
 *
 *	Write a program to take the numbers from the user in a 2d array and print the product of sum of primary and secondary diagonal of 2d array
 *
 */

import java.util.Scanner;

class Program29{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter row :");
		int row = ip.nextInt();
		System.out.println("Enter column :");
                int col = ip.nextInt();


		int arr[][] = new int[row][col];

		System.out.println("Enter the "+ row + " * " +col + " elements : ");
		for(int i = 0 ; i < row; i++){
			
			System.out.println("Enter the row "+i+" values");
			for(int j = 0 ; j< col ; j++){
				arr[i][j] = ip.nextInt();
			}

		}
		int sum = 0; 
		int sum1 = 0;
		int  num = row-1;
		for(int i = 0 ; i < row; i++){
			
                        for(int j = 0 ; j< col ; j++){
				if( num == j ){
                                	sum += arr[i][j];
				}
				if( i == j){
					sum1 += arr[i][j];
				}
                        }
			num--;
			System.out.println();
           	}
		System.out.println("Product of Sum of primary & secondary diagonal is : "+(sum * sum1));
		
		}	
}
