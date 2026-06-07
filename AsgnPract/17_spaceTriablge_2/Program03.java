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
 * 		2	9
 * 	4	25	6
 *
 * 	Input : row = 4
 *
 * 				1	
 * 			2	9
 * 		4	25	6
 * 	49	8	81	10
 *
 */

import java.util.Scanner;

class Program03{

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
					if( num % 2 == 0){
						System.out.print(num+"\t");
						num++;
					}
					else{
						System.out.print(num*num +"\t");
						num++;
					}
				}
			}
			System.out.println();
		}
	}
}
