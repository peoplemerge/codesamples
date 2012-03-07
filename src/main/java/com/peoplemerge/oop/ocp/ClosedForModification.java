package com.peoplemerge.oop.ocp;

import java.util.Collection;

public class ClosedForModification {

	public void drawAllShapes(Collection<Shape> shapes) {
		for (Shape shape : shapes) {
			switch (shape.getType()) {
			case 1:
				drawCircle((Circle) shape);
				break;
			case 2:
				drawSquare((Square) shape);
				break;
			default:
				throw new UnsupportedOperationException();
			}
		}
	}
	
	private void drawCircle(Circle circle){
		System.out.println(circle.getDiameter());
	}
	
	private void drawSquare(Square square){
		System.out.println(square.getVolume());
	}
	
	
	public interface Shape {
		public int getType();
	}
	
	public class Circle implements Shape{
		public int getType(){
			return 1;
		}
		public int getDiameter(){
			return 1;
		}
	}
	
	public class Square implements Shape{
		public int getType(){
			return 2;
		}
		public int getVolume(){
			return 2;
		}
	}
}
