/*
 *
 *	Write a program to take the numbers from the user in a 2d array and print the elements which are divisible by 3
 *
 */

import java.util.Scanner;

class Program26{
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

		System.out.println("elements divisible by 3 : ");
		for(int i = 0 ; i < row; i++){
		
                        for(int j = 0 ; j< col ; j++){
                                if(arr[i][j] % 3 == 0){
					System.out.print(arr[i][j]+" ");
				};
                        }
			System.out.println();
		}

	}	
}
