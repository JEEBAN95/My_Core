package com.jk.test;

import com.jk.bikeTypes.BikeType;
import com.jk.bikefactory.BajajFactory;
import com.jk.classes.Bike;
import com.jk.mfc.NagpurFactory;

public class NorthCustomer {
	public static void main(String[] args) {
		BajajFactory factory =null;
		Bike bike = null;
		
		factory= new NagpurFactory();
		bike = factory.getInstance(BikeType.PULSAR_TYPE);
		
		bike.setBikeID("1001");
		bike.setEngineCC("250");
		bike.drive();
	}
}
