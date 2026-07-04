/*
 *	WAP to print the pergfect no. in the user given range 
 *
 *	INPUT : start = 1 , end = 30
 *
 *		Output : 6 , 28
 *
 *	Perfect NO : A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. 
 *	The simplest way to understand this is by looking at the smallest perfect number, which is 6.
 *	The divisors of 6 (excluding itself) are 1, 2, and 3, and if you add these divisors together (1 + 2 + 3), the sum is 6.
 *
 */


import java.util.Scanner;

class Program01{

	public static void main(String[] args){
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the start no : ");
		int sNum = ip.nextInt();
		System.out.println("Enter the end No : ");
		int eNum = ip.nextInt();
		
		for(int i = sNum ; i <= eNum ; i++){
	
			int x = 1;	
			int sum = 0;
			while(x < i){
				if( i % x == 0){
					sum += x;
				}
				x++;
			}

			if(sum == i){
				System.out.println( i );
			}
		
		}		
	}
}
