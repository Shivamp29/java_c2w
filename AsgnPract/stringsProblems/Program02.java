
package com.strings;

/*
 *  WAT to take the input string and covert to upper and lower
 */

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = ip.next();
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

	}

}
