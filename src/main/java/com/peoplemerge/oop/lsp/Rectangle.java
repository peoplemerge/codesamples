package com.peoplemerge.oop.lsp;

public class Rectangle {

	/**
	 * source http://cafe.elharo.com/programming/a-square-is-not-a-rectangle/trackback/
	 */
	private double width;
	private double height;

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
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