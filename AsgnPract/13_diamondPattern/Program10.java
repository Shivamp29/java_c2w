/*
 *
 *	WAP to print the following pattern 
 *
 *	Input : row = 3
 *
 *
 *				C
 *			B	C	B
 *		A	B	C	B	A
 *			B	C	B
 *				C
 *
 *	Input row = 4
 *
 *						D
 *					C	D	C
 *				B	C	D	C	B
 *			A	B	C	D	C	B	A
 *				B	C	D	C	B
 *					C	D	C	
 *						D
 *
 */

import java.util.Scanner;

class Program10{
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
			char ch;
			if( i > row){
				ch = (char) ( 64 + (row + 1 - i));
			}
			else{
				ch = (char)( 64 + (row * 2 - 1));
			}
			for(int j = 1; j<= col; j++){
				if( j < (col / 2 ) ){
					System.out.print(ch + "\t");
					ch++;
				}
				else{
					System.out.print(ch + "\t");
					ch--;
				}
			}
			System.out.println();
		}
	}
}
