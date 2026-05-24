/*
 * 
 * WAP that accepts 3 numbers and check whether they are pyhtogorian triplets or not
 * 
 *
 * */
import java.util.Scanner;

class Program09{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the 3 sides of the triangle");
		System.out.print("First Side : ");
		int a = ip.nextInt();
		System.out.print("Second Side : ");
		int b = ip.nextInt();
		System.out.print("Third side : ");
		int c = ip.nextInt();
		
		int res1 = a * a;
		int  res2 = b * b;
		int res3 = c * c;
		if( (res1 + res2 == res3) || (res1 + res3 == res2) || (res2 + res3 == res1)) {
			System.out.println("Given triangle sides are pythogorian triplets.");
		}
		else{
			System.out.println("Not a pythogorian triplets");
		}

	}
}
