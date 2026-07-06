
package com.strings;

import java.io.StreamTokenizer;

/*
 *  WAT to take the input string and spit String with words
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program15 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String  : ");
		String s = ip.nextLine();
		
		StringTokenizer stn = new StringTokenizer(s, " ");
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
	}



}
