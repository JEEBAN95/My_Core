package com.jk.mfc;

import com.jk.classes.Bike;
import com.jk.classes.Discover;
import com.jk.classes.Pulsar;

public class NagpurFactory {

	public static void assamble() {
		System.out.println("Bike assamble()");
	}

	public static void paint() {
		System.out.println("Bike.paint()");
	}

	public static void test() {
		System.out.println("Bike.test()");
	}

	public static Bike getInstance(String type) {

		Bike bike = null;

		if (type.equals("pulsar")) {
			bike = new Pulsar();
		} else if (type.equals("discover")) {
			bike = new Discover();
		}
		assamble();
		paint();
		return bike;
	}
}
