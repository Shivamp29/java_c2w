
package com.strings;

/*
 *  WAT to take the 2 input string and and print 0 if both are equals and if not then prints the difference
 *  between the string
 */

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String 1 : ");
		String s1 = ip.next();
		System.out.println("Enter a String 2 : ");
		String s2 = ip.next();
		
		System.out.println("Diffrence : "+s1.compareTo(s2));

	}



}
