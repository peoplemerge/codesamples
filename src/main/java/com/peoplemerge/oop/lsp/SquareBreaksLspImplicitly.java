package com.peoplemerge.oop.lsp;

public class SquareBreaksLspImplicitly extends Rectangle {

	public void setWidth(double width) {
		throw new UnsupportedOperationException();
	}

	public void setHeight(double height) {
		throw new UnsupportedOperationException();
	}

	public void setSide(double size) {
		super.setWidth(size);
		super.setHeight(size);
	}

	/*
	 * However, this is really just a louder way of warning the client that the
	 * Square class does not fulfill the contract of the Rectangle class. It
	 * doesn’t address the fundamental problem that, in object oriented terms, a
	 * square is not a rectangle. The geometric nature of a square is
	 * incompatible with the object-oriented definition of a rectangle given
	 * above.
	 */
	
}
