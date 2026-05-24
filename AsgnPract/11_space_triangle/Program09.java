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
 *	   A 66 c
 *	     66 c
 *	        c	
 *
 * 	Input : row = 4
 *      
 *         65 B 67 D
 *            B 67 D
 *              67 D
 *                 D	   
 *
 */


import java.util.Scanner;

class Program09{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no of row : ");
		int row = ip.nextInt();

		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= row ; j++){
				if(j <= i - 1){
					System.out.print("\t");
				}
				else{
					if( row % 2 == 0  ) {
						if(j % 2 == 0 ){
							System.out.print((char)(64 + j )+ "\t");
						}
						else{
							System.out.print((64+j)+"\t");
						}
					}
					else{
						if(j % 2 == 0 ){
                                                        System.out.print((64 + j )+ "\t");
                                                }
                                                else{
                                                        System.out.print((char)(64+j)+"\t");
                                                }
						
					}
					
				}
			}
			System.out.println();
		}
	}
}

