
package com.strings;

/*
 *  WAT to take the input string and remove the white spaces from the given string
 */

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String 1 : ");
		String s1 = ip.next();
		
		System.out.println(s1.trim());

	}



}
