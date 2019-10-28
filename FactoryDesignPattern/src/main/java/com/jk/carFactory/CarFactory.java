package com.jk.carFactory;

import com.jk.classes.Car;
import com.jk.classes.LauxoryCar;
import com.jk.classes.SimpleCar;
import com.jk.classes.SportsCar;
import com.jk.type.CarTypes;

public class CarFactory extends Thread {
	public static Car getCarInstance(String type) {
		System.out.println("CarFactory.getCarInstance()");
		
		Car car = null;

		if (type.equals(CarTypes.SIMPLE_CAR)) {
			car = new SimpleCar();
		}
		else if (type.equals(CarTypes.LAUXORY_CAR)) {
			car = new LauxoryCar();
		}
		else if (type.equals(CarTypes.SPORTS_CAR)) {
			car = new SportsCar();
		}
		car.carDeliver();
		return car;
	}
}
