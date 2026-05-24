/*
 * WAP a student who has passed the 12 std exam , he thinks he might get the marks up to 85 , 
 * suggest a better currei for him depending upon the marks 
 *
 */
import java.util.Scanner;

class Program04{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the Obtained marks : ");
		int marks = ip.nextInt();
		if(marks >= 85 ){
			System.out.println( "Medical");
		}
		else if(marks >= 75 && marks < 85){
			System.out.println("Engineering");
		}
		else if(marks >= 50 && marks < 75){
			System.out.println("Pharmacy OR BSc.");
		}
		else{
			System.out.println("Choose any thing you like..!");
		}

	}
}
