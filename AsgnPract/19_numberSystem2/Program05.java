/*
W AP to print the Harshad/ Niven number in a user given range. 
Input:
start: 1 
end: 50 
Output:
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18
Harshad number
A number is a Harshad number if it is divisible by the sum of its own digits. 
let's consider the number 18: 
The sum of the digits of 18 is 1 + 8 = 9. 
Since 18 is divisible by 9 i.e(18 % 9 = 0), it is a Harshad number.
   
   */


import java.util.Scanner;

class Program05{

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
	
			int x = i;	
			int sum = 0;
			while( x > 0){
				int rem = x % 10;
				sum += rem;
				x /= 10;;
			}

			if(i % sum == 0){
				System.out.println( i );
			}
		
		}		
	}
}
