package com.peoplemerge.oop.lsp;

public class Square extends Rectangle {
/**
 * source http://cafe.elharo.com/programming/a-square-is-not-a-rectangle/trackback/
 * 
 */
	public void setSide(double size) {
		setWidth(size);
		setHeight(size);
	}

}
