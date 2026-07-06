
package com.strings;

/*
 *  WAT to take the input string and count the vowels in string 
 */

import java.util.Scanner;

public class Program07 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String  : ");
		String s = ip.next();

		int count = 0 ;
		for(int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' ||
					c == 'E' ||c == 'I' || c == 'O' || c == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}

}
