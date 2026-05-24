/*
 *	WAP to print th efollowing pattern :
 *
 *	Input : number of rows = 3
 *		
 *		C	B	A
 *		1	2	3
 *		C	B	A
 *
 *	Input : Number of rows = 4
 *
 *		D	C	B	A
 *		1	2	3	4
 *		D	C	B	A
 *		1	2	3	4
 *
 */

import java.util.Scanner;

class Program08{
	public static void main(String[] args){
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i=1 ; i<= row ; i++){
			char ch = (char) (64 + row);
			for(int j = 1 ; j<= row ; j++){
				if(i % 2 == 0){
					System.out.print(j+"\t");
				}
				else{
					System.out.print(ch+"\t");
					ch--;
				}
			
			}
			System.out.println();
		}
	
	}

}
