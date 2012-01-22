package com.peoplemerge.chess;

import junit.framework.Assert;

import org.junit.Test;

import com.peoplemerge.chess.ChessBoard;
import com.peoplemerge.chess.Knight;

public class ChessBoardTest {

	@Test
	public void startsAtEnd() throws Exception {
		ChessBoard board = new ChessBoard();
		Knight knight = new Knight("a8");
		String moves = board.moveTo(knight, "a8");
		Assert.assertEquals("a8", moves);
	}

	@Test
	public void a8d7() throws Exception {
		ChessBoard board = new ChessBoard();
		Knight knight = new Knight("a8");
		String moves = board.moveTo(knight, "d7");
		Assert.assertEquals("a8 b6 d7", moves);
	}

	@Test
	public void startingOffBoardThrowsException() throws Exception{
		ChessBoard board = new ChessBoard();
		try {
			Knight knight = new Knight("a9");
			String moves = board.moveTo(knight, "d7");
		} catch (IllegalStateException e) {
			return;
		}
		Assert.fail("Exception not caught");
	}

	@Test
	public void endingOffBoardThrowsException() throws Exception{
		ChessBoard board = new ChessBoard();
		try {
			Knight knight = new Knight("a8");
			String moves = board.moveTo(knight, "j7");
		} catch (IllegalStateException e) {
			return;
		}
		Assert.fail("Exception not caught");
	}
	
	@Test
	public void testContainsC2(){
		ChessBoard board = new ChessBoard();
		boolean res = board.contains("c2");
		Assert.assertEquals(true, res);
	}

	@Test
	public void testContainsH8(){
		ChessBoard board = new ChessBoard();
		boolean res = board.contains("h8");
		Assert.assertEquals(true, res);
	}

	@Test
	public void testContainsA1(){
		ChessBoard board = new ChessBoard();
		boolean res = board.contains("a1");
		Assert.assertEquals(true, res);
	}

	@Test
	public void testDoesNotContainI1(){
		ChessBoard board = new ChessBoard();
		boolean res = board.contains("i1");
		Assert.assertEquals(false, res);
	}

	@Test
	public void testDoesNotContainA9(){
		ChessBoard board = new ChessBoard();
		boolean res = board.contains("a9");
		Assert.assertEquals(false, res);
	}

	@Test
	public void testDoesNotContainA0(){
		ChessBoard board = new ChessBoard();
		boolean res = board.contains("a9");
		Assert.assertEquals(false, res);
	}

}
