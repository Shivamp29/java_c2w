/*
 *	WAP To print the following pattern
 *	1. input row : 3
 *
 *		C1 C2 C3
 *		C4 C5 C6
 *		C7 C8 C9
 *
 * 	2. input row : 4
 *
 * 		D1  D2  D3  D4
 * 		D4  D5  D6  D7
 * 		D7  D8  D9  D10
 * 		D10 D11 D12 D13
 *
 */

import java.util.Scanner;

class Program05{
	public static void main(String[] args){
	 Scanner ip = new Scanner(System.in);
	 System.out.println("Enter the no. of rows :" );
	 int row = ip.nextInt();
	char ch = (char) (64 + row);
	int num = 1;
	for(int i = 1 ; i <= row ; i++){
	 	for(int j = 1 ; j <= row ; j++){
			System.out.print(ch+""+num+" ");
			num++;
		}
		System.out.println();
	}
	
	}

}
