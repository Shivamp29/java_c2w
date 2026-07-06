package com.strings;

/*
 *  WAT to reverse a each word in the sentence
 *
 */
import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s1 = ip.nextLine();
		
		String[] words = s1.split(" ");
		String result = "";
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reversedWord = "";
			
			for (int j = word.length() - 1; j >= 0; j--) {
				reversedWord = reversedWord + word.charAt(j);
			}
			
			result = result + reversedWord;
			if (i < words.length - 1) {
				result = result + " ";
			}
		}
		
		System.out.println("Original: " + s1);
		System.out.println("Reversed each word: " + result);
		
		ip.close();
	}
}
