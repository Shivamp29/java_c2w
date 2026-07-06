
package com.strings;

/*
 *  WAT to take the input string and replace all 'a' with 'e'
 */

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String  : ");
		String s = ip.nextLine();
		
		System.out.println(s.replaceAll("a" ,"e" ));

	}



}
