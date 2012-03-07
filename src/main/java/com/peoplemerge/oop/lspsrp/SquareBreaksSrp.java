package com.peoplemerge.oop.lspsrp;

public class SquareBreaksSrp extends Rectangle {

	// source
	// http://cafe.elharo.com/programming/a-square-is-not-a-rectangle/trackback/

	/*
	 * In object oriented programming, it is necessary that a subclass be able
	 * to fulfill the contract of its superclass. In this case, that means the
	 * square has to respond to setHeight() and setWidth() calls. However doing
	 * so enables the square to violate the nature of a square. A square cannot
	 * stand in for a rectangle.
	 * 
	 * You can try to work around this by overriding the setHeight() and
	 * setWidth() methods. For example, one might call the other:
	 */

	public void setWidth(double width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	public void setHeight(double height) {
		super.setWidth(height);
		super.setHeight(height);
	}

	// This is so much trouble! If only there was a way to separate the
	// interface so the square doesn't need to implement all of these things
	// that don't make sense for a square. More of this soon in ISP...

	public void setSide(double size) {
		super.setWidth(size);
		super.setHeight(size);
	}

	/*
	 * However this is fundamentally unsatisfying because there is no reasonable
	 * expectation that calling one of setHeight() on a Rectangle object will
	 * also invoke the setWidth() method or vice versa. The contract of the
	 * Rectangle class is that you can set the width and the height
	 * independently, and the Square subclass violates that. Setting width when
	 * you’re setting height is an unexpected side effect. It violates the
	 * single responsibility principle.
	 */

}
