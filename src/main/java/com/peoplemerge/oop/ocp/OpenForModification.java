package com.peoplemerge.oop.ocp;

import java.util.Collection;

public class OpenForModification {

	public void drawAllShapes(Collection<Shape> shapes) {
		for (Shape shape : shapes) {
			shape.draw();
		}
	}

	public interface Shape {
		public void draw();
	}

	public class Circle implements Shape {
		public void draw() {
			System.out.println("Circle");
		}
	}

	public class Square implements Shape {
		public void draw() {
			System.out.println("Square");
		}
	}
}
