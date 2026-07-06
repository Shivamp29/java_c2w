
package com.strings;

/*
 *  WAT to take the input string and and check if the string is pallindrome or not using StringBuffer 
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program16 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String  : ");
		String s = ip.nextLine();
		
		StringBuffer sb = new  StringBuffer(s);
		StringBuffer rev = sb.reverse();
		
		if(sb == rev) {
			System.out.print("Pallindrom");
		}
		else {
			System.out.print("Not Pallindrom");
		}
		
	}
}
