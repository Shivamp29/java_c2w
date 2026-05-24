/*
 * Right angle triangle :
 *
 * 	* * * *
 * 	* * *		// j <= row + 1 - i
 * 	* * 
 * 	*
 *
 *
 * 	Input : row = 3
 * 	 
 *	 1 2 3
 *	 2 3
 *	 3
 *
 * 	Input : row = 4
 *
 * 	 1 2 3 4
 * 	 2 3 4
 * 	 3 4
 * 	 4
 *
 *
 */


import java.util.Scanner;

class Program08{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = ip.nextInt();
		
		for(int i = 1 ; i <= row ; i++){
			int num = i;
			for(int j = 1; j <= row+1-i ; j++){
				System.out.print(num + "\t");
				num += 1;
			}
			System.out.println();
		}
	}

}
