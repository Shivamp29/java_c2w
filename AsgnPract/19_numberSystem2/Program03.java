/*
	3.  W AP to print the Abundant numbers in the user given range . 
Input:
start : 1
end : 30

Output:
12, 18, 20, 24, 30
Abundant Number:
An abundant number is a positive integer that is smaller than the sum of its proper divisors, excluding
itself. In other words, the sum of the proper divisors of an abundant number is greater than the number
itself.
let's consider the number 12:
The proper divisors of 12 are 1, 2, 3, 4, and 6.
The sum of these proper divisors is 1 + 2 + 3 + 4 + 6 = 16.
Since 16 is greater than 12, 12 is an abundant number.

*/
import java.util.Scanner;

class Program03{

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

			if(sum > i){
				System.out.println( i );
			}
		
		}		
	}
}
