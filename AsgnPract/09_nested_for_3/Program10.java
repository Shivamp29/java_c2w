/*
 *  WAP to print the following pattern
 *  	
 *  	Input : row = 3
 *
 *  		12	11	10
 *  		9	8	7
 *  		6	5	4
 *	
 *	Input : row = 4
 *
 *		20 	19	18	17
 *		16	15	14	13
 *		12	11	10	9
 *		8	7	6	5
 */

import java.util.Scanner;

class Program10{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int row = ip.nextInt();

		int num = row * (row + 1);
		for(int i = 1 ; i <=  row ; i++){
			for(int j = 1 ; j <= row ; j++ ){
				System.out.print(num+"\t");
				num--;
			}
			System.out.println();
		}

		
	}

}

