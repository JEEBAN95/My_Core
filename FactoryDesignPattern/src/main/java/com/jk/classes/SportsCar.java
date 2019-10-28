package com.jk.classes;

public class SportsCar extends Car {

	@Override
	public void carCreation() {
		System.out.println("SportsCar.carCreation()");
	}

	@Override
	public void carAssamble() {
		System.out.println("SportsCar.carAssamble()");
	}

	@Override
	public void carPaint() {
		System.out.println("SportsCar.carPaint()");
	}

	@Override
	public void roadTest() {
		System.out.println("SportsCar.roadTest()");
	}

	@Override
	public void carDeliver() {
		System.out.println("SportsCar.carDeliver()");
	}
}
