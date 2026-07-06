
package com.strings;

/*
 *  WAT to take the input string and reverse a order using loop 
 */

import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String  : ");
		String s = ip.next();

		String rev = "";
		for(int i = s.length()-1 ; i >= 0 ; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

}
