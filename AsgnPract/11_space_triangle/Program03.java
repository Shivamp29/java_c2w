/*
 *	Space triangle :
 *
 *			*	//  i <= row 
 *		      * *	//  j <= row
 *		    * * *	// 		if( j <= row - i )  -> space
 *		  * * * *	// 		else 		    -> value
 *
 * 	Input : row = 3 
 *
 * 		   C
 * 		 B C
 * 	       A B C
 *
 * 	Input : row = 4
 *      
 *                 D
 *               C D 
 *             B C D
 * 	     A B C D	   
 *
 *
 */


import java.util.Scanner;

class Program03{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			
			for(int j = 1 ; j <= row ; j++ ){
				if(j <= row - i ){
					System.out.print("\t");
				}
				else{
					System.out.print((char)(64+j)+"\t");
				}
			}
			System.out.println();
		}
	}
}

