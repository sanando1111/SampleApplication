package org.thread;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.IntStream;

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

public class SyncronizedDemo {
	private int i = 0;

	public void testMethod() {
		synchronized (this) {
			i++;
			System.out.println(i);
		}

	}

	public static void main(String args[]) throws Exception {
		// SyncronizedDemo demo = new SyncronizedDemo();
		// ExecutorService service = Executors.newFixedThreadPool(3);
		// IntStream.range(0, 10000).forEach(count -> service.submit(demo::testMethod));
		// service.awaitTermination(1000, TimeUnit.MILLISECONDS);
		// demo.testMethod();
		/*
		 * String s="madam"; String s1=""; //System.out.println(s.substring(2, 5));
		 * StringBuilder builder=new StringBuilder(); builder.append(s); s.to
		 * s1=builder.reverse().toString(); System.out.println(s.equals(s1));
		 */
		String s="batcatpat(nat";
		Pattern p=Pattern.compile(s);
		System.out.println(p);
		
		
}
}
