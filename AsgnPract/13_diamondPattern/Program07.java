/*
 *
 *	WAP to print the following pattern 
 *
 *	Input : row = 3
 *
 *
 *				C
 *			B	B	B
 *		A	A	A	A	A
 *			B	B	B
 *				C
 *
 *	Input row = 4
 *
 *						D
 *					C	C	C
 *				B	B	B	B	B
 *			A	A	A	A	A	A	A
 *				B	B	B	B	B
 *					C	C	C
 *						D
 *
 */

import java.util.Scanner;

class Program07{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = ip.nextInt();

		int col = 1; 
		int space = 1;
		char ch = (char)( 64 + row + 1);
		for(int i = 1 ; i <= row * 2 - 1 ; i++){
			if(i <= row){
				space = row - i;
				col = i * 2 - 1;
				ch = (char)(ch - 1);
			}
			else{
				space = i - row;
				col -= 2;
				ch = (char) (ch + 1);
			}

			for( int sp = 1 ; sp  <= space ; sp++){
				System.out.print("\t");
			}
			for(int j = 1; j<= col; j++){
				System.out.print(ch + "\t");
			}
			System.out.println();
		}
	}
}
