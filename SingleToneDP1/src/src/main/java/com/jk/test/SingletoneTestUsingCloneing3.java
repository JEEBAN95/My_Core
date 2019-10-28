package com.jk.test;


import com.jk.classes.Printer3;

public class SingletoneTestUsingCloneing3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Printer3 pr, pr1= null;
		
		pr = Printer3.getInstance();
		System.out.println("pr hashCode  "+pr.hashCode());
		pr1 = (Printer3) pr.clone();
		System.out.println("pr hashCode  "+pr1.hashCode());		
	}
}