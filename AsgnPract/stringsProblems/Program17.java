
package com.strings;

/*
 *  WAT to take the input string with comma separated and divide the string 
 *  using StringTokenizer with comma (,) and print the words 
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program17 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String  : ");
		String s = ip.nextLine();
		
		StringTokenizer stn = new StringTokenizer(s , ",");
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken().trim());
		}
		
	}
}
