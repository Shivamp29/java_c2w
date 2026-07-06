

import java.util.Scanner;

/*
 * Write a class Invoice that uses a constructor to set invoiceId, customerName, and 
 * totalAmount. Add a method to apply GST and show the final bill.
 */
class Invoice{
	int invoiceId;
	String custName;
	double totalAmount;
	
	Invoice(int invoiceId , String custName , double totalAmount){
		this.invoiceId = invoiceId;
		this.custName = custName;
		this.totalAmount = totalAmount;
	}
	
	public double applyGst(double gstAmount) {
		return totalAmount + gstAmount;
	}
	
	public void finalBill(double finalAmount) {
		System.out.println("---------------------------------");
		System.out.println("Final Bill : ");
		System.out.println("Invoice Id : "+invoiceId);
		System.out.println("Cust Name : "+custName);
		System.out.println("Total amount  : "+totalAmount);
		System.out.println("Final amount  : "+finalAmount);

	}
}

public class Program01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter invoice id : ");
		int invId = ip.nextInt();
		System.out.println("Enter customer name : ");
		String custName = ip.next();
		System.out.println("Enter Amount :  ");
		double  amount = ip.nextDouble();
		System.out.println("Apply gst of amount : ");
		double gstAmount = ip.nextInt();
		
		Invoice inv = new Invoice(invId , custName , amount);
		double finalAmount = inv.applyGst(gstAmount);
		inv.finalBill(finalAmount);
	}

}
