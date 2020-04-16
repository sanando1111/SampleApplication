package org.hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BigDecimalArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		// Write your code here

		// Arrays.sort(s);

		Arrays.sort(s, 0, n, (o1, o2) -> {
			BigDecimal b1 = new BigDecimal(o1);
			BigDecimal b2 = new BigDecimal(o2);
			return b2.compareTo(b1);
		});

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

	}

}
