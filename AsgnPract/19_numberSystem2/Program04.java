/*
 *
 * W AP to print the Duck Numbers in a given range.
Input:
start: 1
end: 50
Output:
10, 20, 30, 40, 50
Duck Number
A Duck number is a number which has zeroes present in it, but there should be no zero present
in the beginning of the number.
102 is a Duck number because it contains the digit zero and doesn't start with it.
But 0302 is not a duck number because it has 0 at the start
   
   */


import java.util.Scanner;

class Program04{

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
			boolean flag = false;
				
			while( x > 0){
				int rem = x % 10;
				if(rem == 0 ) {
					flag = true;
				}
				x /= 10;;
			}

			if(flag == true){
				System.out.println( i );
			}
		
		}		
	}
}
