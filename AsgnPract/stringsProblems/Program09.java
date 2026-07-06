
package com.strings;

/*
 *  WAT to take the input string and find the first occurrence of 'a'
 */

import java.util.Scanner;

public class Program09 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String  : ");
		String s = ip.next();

		System.out.println(s.indexOf('a'));
	}


}
