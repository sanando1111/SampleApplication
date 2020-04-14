package org.thread;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try(PrintWriter pw=new PrintWriter("C:\\Projects\\Sample.txt")) {} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
