package com.jk.test;

import com.jk.classes.Car;
import com.jk.classes.LauxoryCar;
import com.jk.classes.SimpleCar;

public class GetCars {
	// problem is User can access the un_necessery methods
	public static void main(String[] args) {
		Car car1, car2, car3 = null;
		car1 = new LauxoryCar();
		/*car1.carAssamble();
		car1.carCreation();
		car1.carPaint();
		car1.roadTest();*/
		
		// required
		car1.carDeliver();
		System.out.println("-------------------------------------");
		
		car2 = new SimpleCar();
		/*car2.carAssamble();
		car2.carCreation();
		car2.carPaint();
		car2.roadTest();*/
		
		//required
		car2.carDeliver();
	}
}
