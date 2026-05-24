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
 * 		   1 
 * 		 2 4
 * 	       3 6 9
 *
 * 	Input : row = 4
 *      
 *                  1
 *               2  4 
 *             3 6  9
 * 	     4 8 12 16	   
 *
 *
 */


import java.util.Scanner;

class Program05{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			int num = i ;
			for(int j = 1 ; j <= row ; j++ ){
				if(j <= row - i ){
					System.out.print("\t");
				}else{
					System.out.print( num + "\t");
					num += i ;
				}
			}
			System.out.println();
		}
	}
}

