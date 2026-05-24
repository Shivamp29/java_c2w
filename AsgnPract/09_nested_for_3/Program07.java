/*
 * WAP to print the following pattern
 * 	
 * 	Input : Number of rows = 3
 *
 * 		C 	C	C
 * 		2	2	2
 * 		A	A	A
 *
 * 	Input : Number odf rows = 4
 *
 * 		D	D	D	D
 * 		3	3	3	3
 * 		B	B	B	B
 * 		1	1	1	1
 *		
 *
 */

import java.util.Scanner;

class Program07{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		char ch = (char) (64 + row);
		int num =  row;
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= row ; j++){
				
				if(i % 2 == 0){
					System.out.print(num+"\t");
				}
				else{
					System.out.print(ch+"\t");
				}
			}
			ch--;
			num--;
			System.out.println();
		}
	
	}

}









