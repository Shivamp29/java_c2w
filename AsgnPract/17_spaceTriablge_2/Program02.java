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
 * 			3
 * 		4	5
 * 	6	7	8
 *
 * 	Input : row = 4
 *
 * 				4	
 * 			5	6
 * 		7	8	9
 * 	10	11	12	13
 *
 */

import java.util.Scanner;

class Program02{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = ip.nextInt();

		int num = row;
		for( int i = 1 ; i <= row ; i++){
			for(int j = 1; j <= row ; j++){
				if(j <= row - i){
					System.out.print("\t");
				}
				else{
					System.out.print(num+"\t");
					num++;
				}
			}
			System.out.println();
		}
	}
}
