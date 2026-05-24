/*
 * WAP to check the age of the voter where age must be positive , which means no negative values are allowed
 */
import java.util.Scanner;

class Program06{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = ip.nextInt();
		if(age > 18 ){
			System.out.println("Congratulation.! your are elligible for voting.");
		}
		else if(age < 0){
			System.out.println("Invalid Age. Age must be grater than 18");
		}else{
			System.out.println("you are not elligible for voting");
		}

	}
}
