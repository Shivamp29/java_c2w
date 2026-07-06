
package com.strings;

/*
 *  WAT to take the 2 input string and and concatenate both the string and print the length
 */

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String 1 : ");
		String s1 = ip.next();
		System.out.println("Enter a String 2 : ");
		String s2 = ip.next();
		System.out.println(s1+s2);
		System.out.println("Length of string : "+(s1+s2).length());

	}



}
