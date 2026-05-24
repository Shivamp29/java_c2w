/*
 * WAP to print the following pattern
 * 	
 * 	Input : Number of rows = 4
 *
 * 		16	15	14	13
 * 		12	11	10	9
 * 		8	7	6	5
 * 		4	3	2	1
 *
 */

import java.util.Scanner;

class Program06{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		int num = row * row;
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= row ; j++){
				System.out.print(num + "\t");
				num--;
			}
			System.out.println();
		}
	
	}

}









