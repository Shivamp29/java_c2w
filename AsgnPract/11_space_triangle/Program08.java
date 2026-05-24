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
 * 	   1 2 3
 * 	     2 3 
 * 	       3
 *
 * 	Input : row = 4
 *      
 *         1 2 3 4
 *           2 3 4
 *             3 4
 *               4	   
 *
 */


import java.util.Scanner;

class Program08{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			int num = i;
			for(int j = 1 ; j <= row ; j++){
				if(j <= i - 1){
					System.out.print("\t");
				}
				else{
					System.out.print(num + "\t");
					num++;
				}
			}
			System.out.println();
		}
	}
}

