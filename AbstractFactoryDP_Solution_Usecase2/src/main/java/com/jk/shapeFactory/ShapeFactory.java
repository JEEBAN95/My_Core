package com.jk.shapeFactory;

import com.jk.comp.GeometricShape;

public interface ShapeFactory {
	public GeometricShape createShape(String shape);
}
