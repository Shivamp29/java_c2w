/*
 *	WAP To print the following pattern
 *	1. input row : 4 
 *
 *		1   2  9   4
 *		25  6  49  8
 *		81  10 121 12
 *		169 14 225 16
 *
 * 	
 */

import java.util.Scanner;

class Program08{
	public static void main(String[] args){
	 Scanner ip = new Scanner(System.in);
	 System.out.println("Enter the no. of rows :" );
	 int row = ip.nextInt();
	int num = 1 ;
	 for(int i = 1 ; i <= row ; i++){
	 	for(int j = 1 ; j <= row ; j++){
			if(j % 2 == 0){
				System.out.print(num+" ");
			}else{
				System.out.print((num * num)+" ");
			}
			num++;
		}
		System.out.println();
	}

	}

}
