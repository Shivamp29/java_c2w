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
 * 		   3
 * 		 3 2
 * 	       3 2 1
 *
 * 	Input : row = 4
 *      
 *                 4
 *               4 3 
 *             4 3 2
 * 	     4 3 2 1	   
 *
 *
 */


import java.util.Scanner;

class Program02{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no of row : ");
		int row = ip.nextInt();

		for(int i =  1; i <= row ; i++){
			int num = row;
			for(int j = 1 ; j <= row ; j++ ){
				if(j <= row -i ){
					System.out.print("\t");
				}
				else{
					System.out.print(num + "\t");
					num--;
				}
			}
			System.out.println();
		}
	}
}

