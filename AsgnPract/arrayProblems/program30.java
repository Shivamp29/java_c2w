/*
 *
 *	Write a program to take the numbers from the user in a 2d array and print the corner elements of an array
 *
 */

import java.util.Scanner;

class Program30{
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

		if(row == 1 && col == 1) {
    System.out.println(arr[0][0]);
}
else if(row == 1) {
    System.out.println(arr[0][0] + " " + arr[0][col-1]);
}
else if(col == 1) {
    System.out.println(arr[0][0]);
    System.out.println(arr[row-1][0]);
}
else {

    System.out.println(arr[0][0] + " " + arr[0][col-1]);
   
    System.out.println(arr[row-1][0] + " " + arr[row-1][col-1]);
}

	}
}
