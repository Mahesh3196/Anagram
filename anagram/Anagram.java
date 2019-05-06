package com.anagram;

import java.util.Arrays;
import java.util.Scanner;

/*  An anagram is a word or phrase formed by rearranging the letters in another word or phrase*/

public class Anagram {
	static boolean status;

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("---Input String---");
		System.out.println();
		System.out.println("Enter the First String in Anagram:");
		String first = s.nextLine();
		System.out.println("Enter the Second String in Anagram:");
		String second = s.nextLine();
		System.out.println();

		if (first.length() != second.length()) {
			status = false;
		} else {
			char[] ch1 = first.toLowerCase().toCharArray();
			char[] ch2 = second.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status = Arrays.equals(ch1, ch2);
		}

		System.out.println("--- Output ---");
		System.out.println();

		if (status == true) {
			System.out.println("The given Strings" + " " + first + " " + "and" + " " + second + " " + "are anagram");
		} else {
			System.out.println(first + " " + "and" + " " + second + " " + "are not anagram");
		}
	}

}
