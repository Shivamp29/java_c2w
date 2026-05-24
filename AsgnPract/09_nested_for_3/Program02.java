/*
 * WAP to print the following pattern
 * 	
 * 	Input : Number of rows = 4
 *
 * 		D C B A
 * 		A B C D 
 * 		D C B A
 * 		A B C D
 *
 */

import java.util.Scanner;

class Program02{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			if(i % 2 == 0){
				for(int j =  1; j <= row ; j++){
					System.out.print((char)(64+j) + " ");
				}
			}
			else{
				for(int j = row ; j>= 1 ; j--){
					System.out.print((char)(64+j)+" ");
				}
			}
			System.out.println();
		}
	
	}

}


