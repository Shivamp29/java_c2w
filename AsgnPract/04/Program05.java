/*
 * WAP to check where the given no is in the table of 13 or not
 */
import java.util.Scanner;

class Program02{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the No : ");
		float num = ip.nextFloat();
		if(num % 6 == 0){
			System.out.println(num + " is in table of 6");
		}else{
			System.out.println(num + " is not in table of 6");
		}

	}
}
