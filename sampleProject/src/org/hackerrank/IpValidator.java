package org.hackerrank;

import java.util.Arrays;

public class IpValidator {

	public static void main(String[] args) {

		String ip = "I.Am.not.an+ip";
		if (ip.chars().filter(s -> s == '.').count() == 3) {
			String[] ipar = ip.split("\\.");
			for (String i : ipar)
				System.out.println(i);
			if (ipar.length != 4)
				System.out.println("Invalid Ip");
			else {
				try {
					long p = Arrays.stream(ipar).filter(s -> s.length() >= 2).map(Integer::parseInt)
							.filter(i -> (i >= 0 && i <= 255)).count();
					System.out.println(p == 4 ? "Valid Ip" : "Invalid Ip");
				}
				catch(Exception e)
				{
					System.out.println("Invalid Ip");
				}

				
			}
		} else {
			System.out.println("Invalid Ip");
		}

	}

}
