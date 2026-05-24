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
 * 	Input : row = 4
 *
 * 	   	D C B A 
 * 	     	  D C B
 * 	     	    D C
 * 	     	      D
 *
 * 	Input : row = 5
 *      
 *         E D C B A
 *           E D C B
 *             E C D
 *               E D	   
 *                 E
 */


import java.util.Scanner;

class Program10{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			char ch = (char) (64 + row);
			for(int j = 1 ; j <= row ; j++){
				if(j <= i - 1){
					System.out.print("\t");
				}
				else{
					System.out.print(ch + "\t");
					ch--;
				}
			}
			System.out.println();
		}
	}
}

