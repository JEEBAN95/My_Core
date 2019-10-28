package com.jk.test;

import com.jk.classes.Printer;

public class SingletoneTest1 {

	public static void main(String[] args) {
		
		Printer pr, pr1= null;
		pr = Printer.getInstance();
		pr1 = Printer.getInstance();	
		System.out.println(pr.hashCode()+" "+pr1.hashCode()+" "+(pr==pr1));
	}
}
