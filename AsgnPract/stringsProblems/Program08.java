
package com.strings;

/*
 *  WAT to take the input string and check the string start with "Hello"
 */

import java.util.Scanner;

public class Program08 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String  : ");
		String s = ip.next();

		System.out.println(s.startsWith("Hello"));
	}

}
