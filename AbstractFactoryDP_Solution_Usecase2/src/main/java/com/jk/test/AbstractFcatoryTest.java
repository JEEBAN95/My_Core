package com.jk.test;

import com.jk.comp.GeometricShape;
import com.jk.shapeFactory.DimensionaCreaterFactory;
import com.jk.shapeFactory.ShapeFactory;

public class AbstractFcatoryTest {

	public static void main(String[] args) {
		ShapeFactory factory = null;
		GeometricShape shape = null;
		factory = DimensionaCreaterFactory.dimensionShapeBuilder("3d");
		shape = factory.createShape("line");
		shape.draw();
	}
}
