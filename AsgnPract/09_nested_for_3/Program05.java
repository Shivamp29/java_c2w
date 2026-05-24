/*
 * WAP to print the following pattern
 * 	
 * 	Input : Number of rows = 4
 *
 *		1	4	27	16
 *		125	36	343	64
 *		729	100	1331	144
 *		2197	196	3375	256
 */

import java.util.Scanner;

class Program05{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		int num = 1;
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= row ; j++){
				
				if(j%2 == 0){
					System.out.print((num * num)+"\t");
				}
				else{
					System.out.print(num * num * num + "\t");
				
				}
				num++;
			}
			System.out.println();
		}
	
	}

}


