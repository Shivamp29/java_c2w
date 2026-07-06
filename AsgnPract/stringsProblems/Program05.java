
package com.strings;

/*
 *  WAT to take the input string and print the first and last char of the String 
 */

import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String  : ");
		String s = ip.next();

		
			System.out.println("First : "+s.charAt(0));
		
			System.out.println("Last : "+s.charAt(s.length() - 1));
	}

}
