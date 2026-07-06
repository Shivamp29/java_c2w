package com.strings;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a string 1 : ");
		String s1 = ip.next();
		System.out.println("Enter a string 2 : ");
		String s2 = ip.next();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		boolean isAnagram = true;
		
		if (s1.length() != s2.length()) {
			isAnagram = false;
		} else {
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			
			for (int i = 0; i < arr1.length - 1; i++) {
				for (int j = 0; j < arr1.length - i - 1; j++) {
					if (arr1[j] > arr1[j + 1]) {
						char temp = arr1[j];
						arr1[j] = arr1[j + 1];
						arr1[j + 1] = temp;
					}
				}
			}
			
			for (int i = 0; i < arr2.length - 1; i++) {
				for (int j = 0; j < arr2.length - i - 1; j++) {
					if (arr2[j] > arr2[j + 1]) {
						char temp = arr2[j];
						arr2[j] = arr2[j + 1];
						arr2[j + 1] = temp;
					}
				}
			}
			
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					isAnagram = false;
					break;
				}
			}
		}
		
		if (isAnagram) {
			System.out.println("anagrams.");
		} else {
			System.out.println("not anagrams.");
		}
		
		ip.close();
	}
}