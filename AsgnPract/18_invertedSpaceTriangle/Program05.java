/*
 *
 *	Inverted Space Triangle :
 *
 *		* * * * 	METHOD 1 : 	space : sp <= i - 1;
 *	  	  * * * 			j loop : j <= row + 1 - i
 *          	    * *		METHOD 2 : 	if(j <= i-1) -> space
 *            	      * 			else 	     -> pattern
 *
 *     	WAP to print the following pattern :
 *
 *     	Input : row = 3
 *     		
 *     		A	B	C
 *     			1	2	
 *     				A
 *
 *     	Input : row = 4
 *
 *     		1	2	3	4
 *     			A	B	C
 *     				1	2
 *     					A
 *
 */

import java.util.Scanner;

class Program05{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = ip.nextInt();

		for( int i = 1; i <= row ; i++){
			int num = 1; 
			char ch = 'A';
			for(int j = 1; j <= row ; j++){
				if(j<= i - 1){
					System.out.print("\t");
				}
				else{
					if(row % 2 == 0){
						if(i % 2 == 0){
							System.out.print(ch+"\t");
							ch++;
						}
						else{
							System.out.print(num+"\t");
							num++;
						}
					}
					else{
						if(i % 2 == 0){
                                                        System.out.print(num+"\t");
                                                        num++;
                                                }
                                                else{
                                                        System.out.print(ch+"\t");
                                                        ch++;
                                                }
					}
					
				}
			}
			System.out.println();
		}
	}
}
