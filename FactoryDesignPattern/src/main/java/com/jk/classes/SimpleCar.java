package com.jk.classes;

public class SimpleCar extends Car {

	@Override
	public void carCreation() {
		System.out.println("SimpleCar.carCreation()");
	}

	@Override
	public void carAssamble() {
		System.out.println("SimpleCar.carAssamble()");
	}

	@Override
	public void carPaint() {
		System.out.println("SimpleCar.carPaint()");
	}

	@Override
	public void roadTest() {
		System.out.println("SimpleCar.roadTest()");
	}

	@Override
	public void carDeliver() {
		System.out.println("SimpleCar.carDeliver()");
	}
}
