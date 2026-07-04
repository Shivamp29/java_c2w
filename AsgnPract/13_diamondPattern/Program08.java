/*
 *
 *	WAP to print the following pattern 
 *
 *	Input : row = 3
 *
 *
 *				1	
 *			1	2	1
 *		1	2	3	2	1
 *			1	2	1
 *				1
 *
 *	Input row = 4
 *
 *						1
 *					1	2	1
 *				1	2	3	2	1
 *			1	2	3	4	3	2	1
 *				1	2	3	2	1
 *					1	2	1	
 *						1
 *
 */

import java.util.Scanner;

class Program08{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = ip.nextInt();

		int col = 1; 
		int space = 1;
		for(int i = 1 ; i <= row * 2 - 1 ; i++){
			if(i <= row){
				space = row - i;
				col = i * 2 - 1;
			}
			else{
				space = i - row;
				col -= 2;
			}

			for( int sp = 1 ; sp  <= space ; sp++){
				System.out.print("\t");
			}
			int num = 1;
			for(int j = 1; j<= col; j++){
				if( j <= (col / 2 ) ){
					System.out.print(num + "\t");
					num++;
				}
				else{
					System.out.print(num + "\t");
					num--;
				}
			}
			System.out.println();
		}
	}
}
