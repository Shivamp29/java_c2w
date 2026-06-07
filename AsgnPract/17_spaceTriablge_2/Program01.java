/*
 *	Space Triangle :
 *
 *	      *      Type 1 : 3 for loop
 *	    * *			space :  sp<= row - i
 *	  * * *			j loop : j <= i
 *	* * * *	     Type 2 : 2 for loop
 *				space : if( j <= row - i)
 *				pattern : else
 *
 * 	Innput : row = 3
 *
 * 			1
 * 		3	5
 * 	7	9	11
 *
 * 	Input : row = 4
 *
 * 				1	
 * 			3	5
 * 		7	9	11
 * 	13	15	17	19
 *
 */

import java.util.Scanner;

class Program01{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = ip.nextInt();

		int num = 1;
		for( int i = 1 ; i <= row ; i++){
			for(int j = 1; j <= row ; j++){
				if(j <= row - i){
					System.out.print("\t");
				}
				else{
					System.out.print(num+"\t");
					num+=2;
				}
			}
			System.out.println();
		}
	}
}
