/*
 *	WAP To print the following pattern
 *	1. input row : 3
 *
 *		1A 2B 3C
 *		3C 2B 1A
 *		1A 2B 3C
 *
 * 	2. input row : 4
 *
 * 		 1A 2B 3C 4D
 * 		 4D 3C 2B 1A
 * 		 1A 2B 3C 4D
 * 		 4D 3C 2B 1A
 * 		 
 */

import java.util.Scanner;

class Program09{
	public static void main(String[] args){
	 Scanner ip = new Scanner(System.in);
	 System.out.println("Enter the no. of rows :" );
	 int row = ip.nextInt();
	 for(int i = 1 ; i <= row ; i++){
		if(i % 2 != 0){
		
			for(int j = 1 ; j <= row ; j++){
				System.out.print(j+""+(char)(64+j)+" ");
			}
		}else{
			for(int j = row ; j >= 1 ; j--){
                                System.out.print(j+""+(char)(64+j)+" ");
                        }	
		}
	 
		System.out.println();
	}
	
	}

}
