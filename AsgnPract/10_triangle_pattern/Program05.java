/*
 * Right angle triangle :
 *
 * 	*
 * 	* *		// j <= i
 * 	* * *
 * 	* * * *
 *
 *
 * 	Input : row = 3
 * 	 
 *	 3
 *	 3 6 
 *	 3 6 9
 *
 * 	Input : row = 4
 *
 * 	 4 
 * 	 4 8 
 * 	 4 8 12
 * 	 4 8 12 16
 *
 */


import java.util.Scanner;

class Program05{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = ip.nextInt();
		for(int i = 1 ; i <= row ; i++){
			int num = row;
			for(int j = 1 ; j <= i ; j++){
				System.out.print(num+"\t");
				num += row;
			}
			System.out.println();
		}
		
	}

}
