package com.axis.factory;

import com.axis.model.Circle;
import com.axis.model.Rectangle;
import com.axis.model.Shape;

public class ShapeFactory {

	//this methods returns the shape object
	public Shape getShape(String shapeType) {
		if(shapeType==null)
			return null;
		if(shapeType.equalsIgnoreCase("circle"))
			return new Circle();
		if(shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		return null;
				
	}
	
}