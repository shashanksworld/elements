/*	
 * @author: shashanksworld 
 * @version: 1.1
 */
package com.basic;

// TODO: Auto-generated Javadoc
/**
 * The Class Palindrome.
 * check if a string is palindrome using recursion.
 */
public class Palindrome {
	
	/** test str1. */
	static String str1 = "ABCDCBA";
	
	/** test str2. */
	static String str2 = "ABCDABA";
	
	/** The count. */
	static int count = 0;

	/**
	 * The main method.
	 *
	 * @param arg the arguments
	 */
	public static void main(String arg[]) {
		System.out.println((palindrome(0, str1) > 0) ? "String is Palindrome"
				: " String is not palindrome");

	}

	/**
	 * Palindrome.
	 *
	 * @param index the index
	 * @param str the str
	 * @return the int
	 */
	public static int palindrome(int index, String str) {
		logger("Call " + count + " Start ");
		count++;

		if (index == (str.length() - 1 - index)) {
			return 1;
		} else if (str.charAt(index) == str.charAt(str.length() - 1 - index)) {
			return palindrome(index + 1, str);
		} else
			return -1;

	}

	/**
	 * Logger.
	 *
	 * @param info the info
	 */
	static void logger(String info) {
		System.out.println(info);
	}

}
