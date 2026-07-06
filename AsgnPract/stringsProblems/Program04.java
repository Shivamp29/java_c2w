
package com.strings;

/*
 *  WAT to take the input string and check string equality by ignoring case 
 */

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String 1 : ");
		String s1 = ip.next();
		System.out.println("Enter a String 2 : ");
		String s2 = ip.next();

		if( s1.equalsIgnoreCase(s2)) {
			System.out.println("Equals");
		}
		else {
			System.out.println("not equals");
		}
	}

}
