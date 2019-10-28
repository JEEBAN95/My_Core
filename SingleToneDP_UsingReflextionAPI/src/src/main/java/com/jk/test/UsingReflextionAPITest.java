package com.jk.test;

import java.lang.reflect.Constructor;

import com.jk.classes.MyThread;
import com.jk.classes.Printer;

public class UsingReflextionAPITest {

	public static void main(String[] args) throws Exception, InstantiationException {

		/*Printer pr1, pr2 = null;
		pr1 = Printer.getInstance();
		pr2 = Printer.getInstance();
		System.out.println(pr1.hashCode() + " " + pr2.hashCode());*/

		/*
		 	MyThread myTh = null;
			Thread th1 = null;
			Thread th2 = null;
			
			myTh = new MyThread();
			th1 = new Thread(myTh);
			th2 = new Thread(myTh);
			
			th1.start();
			th2.start();
		*/
		Printer pu1 = null, pu2 = null;
		Class c = null;
		Constructor cons[] = null;
		// create Object for singleton java class
		pu1 = Printer.getInstance();
		//System.out.println("pu1 hashCode:" + pu1.hashCode());
		// get java.lang.Class obj hoilding Printer
		//c = pu1.getClass();
		c= Class.forName("com.jk.classes.Printer");
		// get all the constructors of Printer class
		cons = c.getDeclaredConstructors();
		// get Access to private constructor
		cons[0].setAccessible(true);
		try {
			// create object
			pu2 = (Printer) cons[0].newInstance(null);
		} catch (Exception ie) {
			ie.printStackTrace();
		}
		System.out.println(pu1.hashCode() + "  " + pu2.hashCode());
		System.out.println("pu1==pu2" + (pu1 == pu2));
	}// main
}//class
