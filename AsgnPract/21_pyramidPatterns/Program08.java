/*
 *	WAP to print the following pattern :
 *
 *	Input : row = 3 
 *		
 *				1
 *			1	3	1
 *		1	3	5	3	1
 *
 *	Input : row = 4
 *			
 *				1
 * 			1	3	1	
 * 		1	3	5	3	1	
 *	1	3	5	7	5	3	1	
 *
 */

import java.util.Scanner;

class Program08{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = ip.nextInt();
		for(int i = 1 ; i<= row ; i++){
			for(int sp = 1; sp <= row - i ; sp++){
				System.out.print("\t");
			}
			int num = 1;
			for(int j = 1 ; j<= i * 2 - 1; j++){
				if(j < i ){
					System.out.print(num + "\t");
					num += 2;
				}
				else{
					System.out.print(num+"\t");
					num -= 2;
				}
			}
			System.out.println();
		}
	}
}
