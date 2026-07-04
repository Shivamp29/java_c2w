/*
	  W AP to print the Deficient numbers in a user given range. 
		Input :
			start:1
			end:10 
		Output:
			1, 2, 3, 4, 5, 7, 8, 9
	Deficient number : 
		A deficient number is a positive integer that is greater than the sum of its proper divisors, excluding itself.
		In other words, the sum of the proper divisors of a deficient number is less than the number itself.
	let's take the number 8: 
	The proper divisors of 8 are 1, 2, and 4. 
	The sum of these proper divisors is 1 + 2 + 4 = 7. 
	As 7 is less than 8 it is a deficient number.

   
   */


import java.util.Scanner;

class Program02{

	public static void main(String[] args){
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the start no : ");
		int sNum = ip.nextInt();
		System.out.println("Enter the end No : ");
		int eNum = ip.nextInt();
		
		if(sNum < 0 || eNum <0 ){
			System.out.println("No can not be negative");
			return;
		}

		for(int i = sNum ; i <= eNum ; i++){
	
			int x = 1;	
			int sum = 0;
			while(x < i){
				if( i % x == 0){
					sum += x;
				}
				x++;
			}

			if(sum < i){
				System.out.println( i );
			}
		
		}		
	}
}
