
package com.strings;

/*
 *  WAT to take the input string and Find the char at give index
 */

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = ip.next();
		System.out.println("Enter index to find char in String : ");
		int index = ip.nextInt();
		if(index > s.length()) {
			System.out.println("Enter valid Index");
		}
		else {
			System.out.println(s.charAt(index));
		}
	}

}
