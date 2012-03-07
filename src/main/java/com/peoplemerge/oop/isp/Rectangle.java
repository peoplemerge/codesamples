package com.peoplemerge.oop.isp;

public class Rectangle implements Shape {
	
	private final double width;
	private final double height;
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}

	public double getWidth() {
		return this.width;
	}
	public double getPerimeter() {
		return 2 * width + 2 * height;
	}

	public double getArea() {
		return width * height;
	}
	
}
