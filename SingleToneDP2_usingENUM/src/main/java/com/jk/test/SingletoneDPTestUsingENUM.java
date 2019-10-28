package com.jk.test;

import com.jk.classes.Printer1;

public class SingletoneDPTestUsingENUM {

	public static void main(String[] args) {
		
		Printer1 p1,p2 = null;
		p1 =  Printer1.INSTANCE;
		p2 = Printer1.INSTANCE;
		System.out.println(p1.hashCode()+" "+p2.hashCode());
	}
}
