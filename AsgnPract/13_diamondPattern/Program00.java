/*
 *
 *	Diamond Pattern :
 *
 *		       *
 *		     * * *
 *		   * * * * *
 *		 * * * * * * *
 *		   * * * * *
 *		     * * *
 *		       *
 *	
 *	METHOD 1 :
 *		
 *		declare int col;
 *		i <= row * 2 - 1
 *		if( i <= row ) 
 *			sp <= row - i -> top spaces loop
 *		else
 *			sp <= i - row -> bottom spaces loop
 *
 * 		if( i <= row )
 * 			col = i * 2 - 1;
 * 		else
 * 			col = col - 2;
 *
 * 		pattern loop
 * 			j <= col -> pattern
 *
 *	METHOD 2 : 
 *		
 *		declare int col, int space;
 *
 *		i loop : i <= row * 2 - 1;
 *		
 *		if( i <= row )
 *			space = row - i;
 *			col = i * 2 - 1;
 *		else 
 *			space = i - row;
 *			col = col - 2;
 *
 *		space loop -> sp <= space -> space
 *		pattern loop -> j <= col -> pattern
 *
 *
 */
import java.util.Scanner;

class Program00{
	public static void main(String[] args){
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the numbber of rows : ");
		int row = ip.nextInt();


		System.out.println("Method 1: ");
		int col1 = 1 ;
		for(int i = 1; i <= row * 2 - 1; i++){
			if(i <= row){
				for(int sp = 1 ; sp <= row - i ; sp++){
					System.out.print("\t");
				}
			}
			else{
				for(int sp = 1 ; sp <= i - row ; sp++){
					System.out.print("\t");
				}
			}

			if(i <= row){
				col1 = i * 2 - 1;
			}
			else{
				col1 -= 2;
			}

			for( int j = 1 ; j <= col1 ; j++){
				System.out.print("* \t");
			}
			System.out.println();
		}

		System.out.println("METHOD 2 : ");
		int col2 = 1 ; int space = 1;
		for(int i = 1 ; i <= row * 2 - 1 ; i++){
			if( i <= row){
				space = row - i;
				col2 = i * 2 - 1;
			}
			else{
				space =  i - row;
				col2 = col2 - 2;
			}

			for( int sp = 1 ; sp <= space ; sp++){
				System.out.print("\t");
			}

			for( int j = 1 ; j <= col2; j++){
				System.out.print("* \t");
			}
			System.out.println();
		}
	}
}
