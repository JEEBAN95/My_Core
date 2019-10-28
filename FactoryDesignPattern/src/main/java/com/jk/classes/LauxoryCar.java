package com.jk.classes;

public class LauxoryCar extends Car {

	@Override
	public void carCreation() {
		System.out.println("LauxoryCar.carCreation()");
	}

	@Override
	public void carAssamble() {
		System.out.println("LauxoryCar.carAssamble()");
	}

	@Override
	public void carPaint() {
		System.out.println("LauxoryCar.carPaint()");
	}

	@Override
	public void roadTest() {
		System.out.println("LauxoryCar.roadTest()");
	}

	@Override
	public void carDeliver() {
		System.out.println("LauxoryCar.carDeliver()");
	}
}
