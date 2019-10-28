package com.jk.bikefactory;

import com.jk.classes.Bike;

public abstract class BajajFactory {

	public abstract void assamble();

	public abstract void paint();

	public abstract void test();

	public abstract Bike getInstance(String type);
}
