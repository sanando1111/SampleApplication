package org.hackerrank;

import java.util.regex.Pattern;

public class UserNameCheck {
	/*
	 * 8 Julia Samantha Samantha_21 1Samantha Samantha?10_2A JuliaZ007 Julia@007
	 * _Julia007
	 * 
	 * 
	 * op: Invalid Valid Valid Invalid Invalid Valid Invalid Invalid
	 */

	public static void main(String[] args) {
		String s = "Samantha_21";
		String pattern = "^[a-zA-Z][a-zA-Z0-9_]{8,30}";
		System.out.println(s.matches(pattern));

	}

}
