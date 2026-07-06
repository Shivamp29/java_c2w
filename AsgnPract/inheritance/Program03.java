package com.inheritance;


/*
 * Write a class Doctor with a constructor that sets doctorId, name, and specialization. Add a
 * method to show consultation fee based on specialization.
 */

import java.util.Scanner;
class Doctor{
	int docId;
	String name;
	String Specialization;
	
	Doctor(int docId , String name , String Specialization){
		this.docId = docId;
		this.name = name;
		this.Specialization = Specialization;
	}
	
	double showCunsultationFee(String Specialization) {
			switch(Specialization) {
			case "Orth" : return 2000;
			case "Cardiologists" :  return 4000 ; 
			case "Endocrinologists" :  return 6000 ; 
			case "Nephrologists" :  return 6000 ; 
			case "Oncologists" :  return 8000 ; 
			default : return  1000;
		}
	}
	public void shoeDetails() {
		System.out.println("---------------------------------");
		System.out.println("Final ticket : ");
		System.out.println("Doc id  : "+docId);
		System.out.println("name : "+name);
		System.out.println("Specialization  : "+Specialization);
		System.out.println("Cunsultation fee  : "+showCunsultationFee(Specialization));
	}
}

public class Program03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter docId : ");
		int docId = ip.nextInt();
		System.out.println("Enter name : ");
		String name = ip.next();
		System.out.println("1. Orth , 2. Cardiologists , 3 Endocrinologists , 4. Nephrologists , 5.Oncologists , 6. Other ");
		System.out.println("select Specialization ");
		String specialization;
		int  SpecializationID = ip.nextInt();
		switch(SpecializationID) {
			case 1 : specialization =  "Orth"; break;
			case 2 : specialization =  "Cardiologists"; break;
			case 3 : specialization =  "Endocrinologists"; break;
			case 4 : specialization =  "Nephrologists"; break;
			case 5 : specialization =  "Oncologists"; break;
			default : specialization =  "Other";
		}
		Doctor inv = new Doctor(docId , name , specialization);
		inv.shoeDetails();
	}

}
