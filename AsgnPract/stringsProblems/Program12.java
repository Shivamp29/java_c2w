
package com.strings;

/*
 *  WAT to take the 2 input string and and check if the both strings objects are equal or not
 *  if equal print true else false
 */

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String 1 : ");
		String s1 = ip.next();
		System.out.println("Enter a String 2 : ");
		String s2 = ip.next();
		
		System.out.println(s1.equals(s2));

	}



}
