package com.jk.shapeFactory;

public class DimensionaCreaterFactory {

	public static ShapeFactory dimensionShapeBuilder(String dimensionType) {
		ShapeFactory factory = null;
		if (dimensionType.equalsIgnoreCase("3d")) {
			factory = new ThreeDShapeFactory();
		} // if
		else {
			factory = new TwoDShapeFactory();
		} // else
		return factory;
	}// dimensionShapeBuilder
}
