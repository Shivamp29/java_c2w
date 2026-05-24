/*
 *	WAP To print the following pattern
 *	1. input row : 3
 *
 *		# # #
 *		$ $ $
 *		@ @ @
 *
 * 	2. input row : 5
 *
 * 		 # # # # #
 * 		 $ $ $ $ $
 * 		 @ @ @ @ @
 * 		 # # # # #
 * 		 $ $ $ $ $ 		 
 */

import java.util.Scanner;

class Program10{
	public static void main(String[] args){
	 Scanner ip = new Scanner(System.in);
	 System.out.println("Enter the no. of rows :" );
	 int row = ip.nextInt();
	 for(int i = 1 ; i <= row ; i++){
		for(int j = 1 ; j <= row ; j++){
			if(i % 3 == 1){
				System.out.print("# ");
			}
			else if(i % 3 == 2){
				System.out.print("$ ");
			}
			else if(i % 3 == 0){
				System.out.print("@ ");
			}
		}	 
		System.out.println();
	}
	
	}

}
