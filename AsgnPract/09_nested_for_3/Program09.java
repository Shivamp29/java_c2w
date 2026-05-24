/*
 * WAP to print the following pattern
 * 	
 * 	Input : Number of rows = 3
 *
 * 		C 	2	A
 * 		A	2	C
 * 		C	2	A
 *
 * 	Input : Number of row = 4
 * 		
 * 		D 	3 	B	1
 * 		A	2	C	4
 * 		D	3	B	1
 * 		A	2	C	4
 *
 */

import java.util.Scanner;

class Program09{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();
		for(int i = 1 ; i<= row  ; i++){
			if(i % 2 == 0){
				for(int j = 1 ; j<= row ; j++){
					if(j % 2 == 0){
						System.out.print(j+"\t");
					}
					else{
						System.out.print((char)(64+j)+"\t");
					}
					
				}
			}
			else{
			
				int num = row;
				for(int j = 1 ; j <= row ; j++){
				
					if(j % 2 == 0){
						System.out.print 
					}
					else{
						System.out.print(j+"\t");
					}
				}
			}
			System.out.println();
		}
	
	}

}









