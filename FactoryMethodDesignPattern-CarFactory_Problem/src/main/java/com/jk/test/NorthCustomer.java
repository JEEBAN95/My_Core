package com.jk.test;

import com.jk.classes.Bike;
import com.jk.mfc.NagpurFactory;

public class NorthCustomer {
	public static void main(String[] args) {
		
		Bike bike = NagpurFactory.getInstance("pulsar");
		bike.drive();
	}
}
