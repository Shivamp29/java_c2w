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
 * 		A	A
 * 	4	5	6
 *
 * 	Input : row = 4
 *
 * 				1	
 * 			A	A
 * 		4	5	6
 * 	B	B	B	B
 *
 */

import java.util.Scanner;

class Program07{

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = ip.nextInt();

		int num = 1;
		char ch = 'A';
		for( int i = 1 ; i <= row ; i++){
			for(int j = 1; j <= row ; j++){
				if(j <= row - i){
					System.out.print("\t");
				}
				else{
					if( i % 2 == 0){
						System.out.print(ch+"\t");
						num++;
					}
					else{
						System.out.print(num+"\t");
						num++;
					}
				}
			}
			ch++;
			System.out.println();
		}
	}
}
