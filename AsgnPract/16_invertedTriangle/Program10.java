/*
 *
 *	WAP to print the following pattern.
 *
 *	Input : row = 3
 *
 *		A	66	C
 *		66	C
 *		C
 *		
 *	Input : row = 4
 *
 *		65	B	67	D
 *		B	67	D	
 *		67	D
 *		D
 */

import java.util.Scanner;

class Program10{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			int num = 64 + i;
			if( row % 2 == 0){
				for(int  j = 1 ; j <= row + 1 - i ; j++){
			
					if(i % 2 == 0){	
						if(j % 2 == 0){
							System.out.print(num+"\t");
							num++;
						}
						else{
							System.out.print((char) num + "\t");
							num++;
						}
					}else{
						if(j % 2 == 0){
							System.out.print((char) num + "\t");
							num++;
						}
						else{
							System.out.print(num+"\t");
							num++;
						}
					
					}
				}
			}
			else{
				for(int j = 1 ; j <= row+1-i;  j++){
					if(i % 2 == 0){
						if(j % 2 == 0){
							System.out.print((char)num+"\t");
							num++;
						}
						else{
							System.out.print(num+"\t");
							num++;
						}
					}
					else{
						if(j % 2 == 0){
							System.out.print(num+"\t");
							num++;
						}
						else{
							System.out.print((char)num+"\t");
							num++;
						}
					}
				}
				
			}
			System.out.println();
		}
	
	}
}
