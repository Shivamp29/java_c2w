 
/*
 *WAP to create the calculator (+ , - , * , / , % )
 *
 */

import java.util.Scanner;

class Program09{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println(" Arithemtic Simple calculator : ");
		System.out.println("Enter 2 numbers : ");
		int num1 = ip.nextInt();
		System.out.print("math 2 :");
                int num2 = ip.nextInt();
		System.out.print("Select the bellow option to perform the calculation :");
		System.out.println("1. Add 2. Substract 3. Multiplication 4. didvision 5. Remainder ");
                int selectedOption = ip.nextInt();
		switch(selectedOption){
			case 1 : System.out.println(" Addition is : "+ (num1 + num2 )); break ;
                         case 2 : System.out.println(" Substraction is : "+ (num1 - num2 )); break;
                         case 3 : System.out.println(" Multiplication : "+ (num1 * num2 )); break;
			case 4 : System.out.println(" Division is : "+ (num1 / num2 )); break ;
			case 5: System.out.println(" Remainder is : "+ (num1 % num2 )); break;
			default : System.out.println(" Invalid option ");
		}
	}
}

