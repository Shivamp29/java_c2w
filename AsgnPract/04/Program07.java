/*
 * Calulate the profit or loss
 * WAP that takes the cost price and selling price , and calculate it profit or loss
 */
import java.util.Scanner;

class Program07{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter cost price :");
		double costPrice = ip.nextDouble();
		System.out.println("Enter selling price :");
                double sellingPrice = ip.nextDouble();
		
		if(costPrice > sellingPrice ){
			System.out.println("Loss of rs "+(costPrice - sellingPrice));
		}
		else if(costPrice < sellingPrice){
			System.out.println("Profit Of rs"+(sellingPrice - costPrice));
		}else{
			System.out.println("No Profit No Loss!");
		}

	}
}
