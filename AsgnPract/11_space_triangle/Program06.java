/*
 *	Space triangle :
 *
 *		* * * *		Method 1 -> 2 for loops
 *		  * * *		 		space for loop -> sp <= i -1 
 *		    * *		 		j for loop  	  -> j <= row + 1 - i
 *		      *	
 *		      		Method 2 -> single for  loop
 *
 *		      				if( j <= i- 1) -> space 
 *		      				else 	       -> value
 *		      			
 * 	Input : row = 3 
 *
 * 	   3 3 3
 * 	     2 2
 * 	       1
 *
 * 	Input : row = 4
 *      
 *         4 4 4 4
 *           3 3 3
 *             2 2
 *               1	   
 *
 */


import java.util.Scanner;

class Program06{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no of row : ");
		int row = ip.nextInt();

		int num1 = row ;
		System.out.println("---- Method : 1 ");
		for(int i = 1; i <= row ; i++){
			for(int sp = 1 ; sp <= i-1 ; sp++){
				System.out.print("\t");
			}

			for(int j = 1 ; j <= row + 1 - i ; j++){
				System.out.print(num1 +"\t");
			}
			num1--;
			System.out.println();
		}

		System.out.println("---- MEthod : 2 ");
		int num2 = row;
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= row ; j++){
				if(j <= i - 1){
					System.out.print("\t");
				}
				else{
					System.out.print(num2 + "\t");
				}
			}
			num2--;
			System.out.println();
		}
	}
}

