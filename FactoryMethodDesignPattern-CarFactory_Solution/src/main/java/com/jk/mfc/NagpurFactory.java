package com.jk.mfc;

import com.jk.bikeTypes.BikeType;
import com.jk.bikefactory.BajajFactory;
import com.jk.classes.Bike;
import com.jk.classes.Discover;
import com.jk.classes.Pulsar;

public class NagpurFactory extends BajajFactory {
 
	@Override
	public void assamble() {
		System.out.println("Bike assambling");
	}

	@Override
	public void paint() {
		System.out.println("Bike painting");
	}

	@Override
	public void test() {
		System.out.println("Bike testing");
	}

	@Override
	public Bike getInstance(String type) {
		Bike bike = null;

		if (type.equals(BikeType.PULSAR_TYPE)) {
			bike = new Pulsar();
		} 
		else if (type.equals(BikeType.DISCOVER_TYPE)) {
			bike = new Discover();
		}
		assamble();
		paint();
		test();
		return bike;
	}
}
