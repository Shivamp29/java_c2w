/*
 *
 *	WAP to print the following pattern 
 *
 *	Input : row = 3
 *
 *
 *				1
 *			2 	2	4
 *		5	6	7	8	9
 *			10	11	12	
 *				13
 *
 *	Input row = 4
 *
 *						1
 *					2	3	4
 *				5	6	7	8	9
 *			10	11	12	13	14	15	16
 *				17	18	19	20	21
 *					22	23	24
 *						25
 *
 */

import java.util.Scanner;

class Program03{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = ip.nextInt();

		int col = 1; 
		int space = 1;
		int num = 1;
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
			for(int j = 1; j<= col; j++){
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
	}
}
