package com.peoplemerge.chess;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class ChessBoard {
	public class CannotMoveException extends Exception {
		private static final long serialVersionUID = -1782795182539658247L;
	}

	private final int ranks = 8, files = 8;

	public String moveTo(Knight knight, String endingPosition)
			throws IllegalStateException, CannotMoveException {
		if (!contains(knight.getCurrentPosition())) {
			throw new IllegalStateException();
		}
		if (!contains(endingPosition)) {
			throw new IllegalStateException();
		}
		if (knight.getCurrentPosition().equals(endingPosition)) {
			List<String> dontMove = new LinkedList<String>();
			dontMove.add(endingPosition);
			return StringUtils.join(dontMove, ' ');
		}
		List<String> newMoves = knight.locateDistinct(this);
		while (newMoves.size() > 0) {
			// Though slightly awkward iteration the result is that this should
			// grow in such a way as to find the shortest path first since
			// longer paths are added to the end.
			String move = newMoves.remove(0);
			knight.moveTo(move);
			if (move.equals(endingPosition)) {
				return StringUtils.join(knight.visited(), ' ');
			}
			newMoves.addAll(knight.locateDistinct(this));
		}
		throw new CannotMoveException();
	}

	public boolean contains(int file, int rank) {
		if (file < 1 || file > files || rank < 1 || rank > ranks) {
			return false;
		}
		return true;
	}

	public boolean contains(String position) {
		// TODO Rather than using this position as a string, an abstraction
		// should really be made that encapsulates a Space object, e.g. c2 is an
		// instance of a Space on a Board.
		char[] pos = position.toCharArray();
		int file = pos[0] - 'a' + 1;
		int rank = pos[1] - '1' + 1;
		return contains(file, rank);
	}

}
