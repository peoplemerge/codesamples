package com.peoplemerge.oop.lsp;

import static junit.framework.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

import com.peoplemerge.oop.lspsrp.Square;

public class SquareTest {
// source: http://cafe.elharo.com/programming/a-square-is-not-a-rectangle/trackback/
	@Ignore
	public void testSquareApi() {
		/*
		 * There are actually several problems here. Thread safety is one, but
		 * let's assume the class doesn't need to be thread-safe. Another is
		 * that it's possible to give the sides negative lengths. That we could
		 * fix with a couple of judiciously thrown IllegalArgumentExceptions.
		 * However the problem that most troubles me is demonstrated here:
		 */
		Square s = new Square();
		s.setWidth(5.0);
		s.setHeight(10.0);
		fail();
	}

}
