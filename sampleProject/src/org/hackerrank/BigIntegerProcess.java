package org.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerProcess {
	
	
    
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        String  a=sc.nextLine();
        String  b=sc.nextLine();
        BigInteger ai=new BigInteger(a);
        BigInteger bi=new BigInteger(b);
        System.out.println( ai.add(bi));
        System.out.println(ai.multiply(bi));
    	
    	
    }

}
