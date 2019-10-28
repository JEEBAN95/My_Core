package com.jk.shapeFactory;

import com.jk.comp.Circle;
import com.jk.comp.GeometricShape;
import com.jk.comp.Line;

public class TwoDShapeFactory implements ShapeFactory  {

	public TwoDShapeFactory() {
		System.out.println("TwoDShape");
	}
	
	@Override
	public GeometricShape createShape(String shape) {
		GeometricShape gshape=null;
		if(shape.equalsIgnoreCase("line")) {
			gshape = new Line();
		}
		else {
			gshape =  new Circle();
		}
		return gshape;
	}
}
