/*
 *
W AP that generates the first n numbers in the Fibonacci series. And store
it in an array of similar size as that of n.
Input

Enter a number: 10
Output :
Fibonacci Series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
Fibonacci series
The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones,
usually starting with 0 and 1. In mathematical terms, the Fibonacci sequence
F(n) is defined by the recurrence relation:
F(n)=F(n−1)+F(n−2)
with initial conditions
F(0)=0 and
F(1)=1.
So, the Fibonacci sequence starts like this:
0,1,1,2,3,5,8,13,21,34,…
   
   */


import java.util.Scanner;

class Program06{

	public static void main(String[] args){
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int sNum = ip.nextInt();

		int x = 0;
		int y = 1;
		for( int i =  1 ; i<= sNum ; i++){
			System.out.println(x);
			int next = x + y;
			x = y;
			y = next;
		}
				
	}
}
