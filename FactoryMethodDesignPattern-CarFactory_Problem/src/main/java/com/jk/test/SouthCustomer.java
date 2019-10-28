package com.jk.test;

import com.jk.classes.Bike;
import com.jk.mfc.ChennaiFactory;

public class SouthCustomer {
	public static void main(String[] args) {
		Bike bike = ChennaiFactory.getInstance("discover");
		bike.drive();
	}
}
