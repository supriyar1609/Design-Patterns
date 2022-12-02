package com.axis.app;

import com.axis.factory.ShapeFactory;
import com.axis.model.Shape;

public class FactoryPattern {

	public static void main(String[] args) {
		System.out.println("=====Factory Pattern Demo======");
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape =shapeFactory.getShape("rectangle");
		// Shape s1 = new Rectangle();
		shape.draw();
		shape.displayInfo();
	
	}

}