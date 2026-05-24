 
/*
 *WAP a program in which the student should enter the marks for the 5 subjects  , if all the  subjects have the above passing marks add them and provide the switch case to print all the grades 
 * , ( first class with destinction , first class , second class , pass , fail) if student gets failed in any subject , the program should print the "You failed the exam"
 *
 */

import java.util.Scanner;

class Program08{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your subjects marks: ");
		System.out.print("Physucs 1 :");
		double phy = ip.nextDouble();
		System.out.print("math 2 :");
                double math = ip.nextDouble();
		System.out.print("Biology 3 :");
                double bio = ip.nextDouble();
		System.out.print("Chemistry 4 :");
                double chem = ip.nextDouble();
		System.out.print("English 5 :");
                double eng = ip.nextDouble();
		
		if( phy >= 35 && math >= 35 && bio >= 35 && chem >= 35 && eng >= 35 ){
			double totalMarks = phy + math + bio + chem + eng;
			double percentage = (totalMarks / 500) * 100;

			int gradesNo;

			if(percentage >= 85){
				gradesNo = 1;
			}
			else if(percentage >= 65 && percentage < 85){
				gradesNo = 2;
			}
			else if(percentage >= 50 && percentage < 65){
				gradesNo = 3;
			}
			else {
				gradesNo = 4;
			}

			switch(gradesNo){
				case 1 : System.out.println("First class with destintion."); break ;
				case 2 : System.out.println("First class"); break ;
				case 3 : System.out.println("Second class."); break ;
				default : System.out.println("Pass"); 
			}
		}
		else{
			System.out.println("You failed the exam.");
		}	
	}
}

