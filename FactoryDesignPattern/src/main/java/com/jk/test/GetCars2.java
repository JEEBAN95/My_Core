package com.jk.test;

import com.jk.carFactory.CarFactory;
import com.jk.classes.Car;
import com.jk.classes.LauxoryCar;
import com.jk.classes.SimpleCar;
import com.jk.type.CarTypes;

public class GetCars2 {
	// problem is User can access the un_necessery methods
	
	public static void main(String[] args) {
		Car car1, car2 = null;
		car1 = CarFactory.getCarInstance(CarTypes.SIMPLE_CAR);
		car2 = CarFactory.getCarInstance(CarTypes.LAUXORY_CAR);
		System.out.println(car1.hashCode()+" "+car2.hashCode());
	}
}
