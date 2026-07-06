
package com.strings;

/*
 *  WAT to take the input string as sentence and and check if 
 *  the sentence contains the substring or not using toString().contains()   
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program18 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a Sentence  : ");
		String s = ip.nextLine();
		System.out.println("Enter a subString  : ");
		String subS = ip.nextLine();

		if(s.contains(subS)) {
			System.out.println("a sentence contains the subString : "+subS);
		}
		else {
			System.out.println("a sentence does not contains the subString : "+subS);
		}
	}
}
