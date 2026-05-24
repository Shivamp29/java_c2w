/*
 * WAP to Program where the the give no is in the rage of 1 to 1000 or not 
 */
import java.util.*;
class Program01{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter start number : " );
		int startNum = ip.nextInt();
		System.out.println("Enter end Number : ");
		int endNum = ip.nextInt();
		System.out.println("Enter no to search between the start and end number : ");
		int searchNum = ip.nextInt();
		if(searchNum >= startNum && searchNum <= endNum){
			System.out.println(searchNum + " is in the range of "+startNum+ " AND "+ endNum);
		}
		else{
			System.out.println(searchNum+" is not in the given range");
		}
	}
}
