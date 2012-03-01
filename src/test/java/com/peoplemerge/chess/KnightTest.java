package com.peoplemerge.chess;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.peoplemerge.chess.ChessBoard;
import com.peoplemerge.chess.Knight;

public class KnightTest {

	ChessBoard board = new ChessBoard();
	/**
	 * 
	 */
	@Test
	public void testFindMovesD4(){
		Knight knight = new Knight("d4");
		List<String> moves = knight.findMoves(board);
		
		List<String> expected = new LinkedList<String>();
		Collections.addAll(expected,"c2","b3","b5","c6","e6","f5","f3","e2");
		if(moves.containsAll(expected) && expected.containsAll(moves)){
			return;
		}
		Assert.fail("expected (" + expected + ") and actual(" + moves + ") sets are disjoint");
	}

	@Test
	public void testFindMovesA1(){
		Knight knight = new Knight("a1");
		List<String> moves = knight.findMoves(board);
		
		List<String> expected = new LinkedList<String>();
		Collections.addAll(expected,"c2","b3");
		if(moves.containsAll(expected) && expected.containsAll(moves)){
			return;
		}
		Assert.fail("expected (" + expected + ") and actual(" + moves + ") sets are disjoint");
	}

	@Test
	public void testFindMovesA8(){
		Knight knight = new Knight("a8");
		List<String> moves = knight.findMoves(board);
		
		List<String> expected = new LinkedList<String>();
		Collections.addAll(expected,"b6","c7");
		if(moves.containsAll(expected) && expected.containsAll(moves)){
			return;
		}
		Assert.fail("expected (" + expected + ") and actual(" + moves + ") sets are disjoint");
	}

	@Test
	public void testFindMovesH8(){
		Knight knight = new Knight("h8");
		List<String> moves = knight.findMoves(board);
		
		List<String> expected = new LinkedList<String>();
		Collections.addAll(expected,"f7","g6");
		if(moves.containsAll(expected) && expected.containsAll(moves)){
			return;
		}
		Assert.fail("expected (" + expected + ") and actual(" + moves + ") sets are disjoint");
	}

	@Test
	public void testFindMovesH1(){
		Knight knight = new Knight("h1");
		List<String> moves = knight.findMoves(board);
		
		List<String> expected = new LinkedList<String>();
		Collections.addAll(expected,"f2","g3");
		if(moves.containsAll(expected) && expected.containsAll(moves)){
			return;
		}
		Assert.fail("expected (" + expected + ") and actual(" + moves + ") sets are disjoint");
	}

}
