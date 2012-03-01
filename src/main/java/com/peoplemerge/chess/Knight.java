package com.peoplemerge.chess;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Consider abstracting an interface
public class Knight {
	private Map<String, List<String>> visited = new HashMap<String, List<String>>();
	private String currentPosition;

	public Knight(String startingPosition) {
		currentPosition = startingPosition;
		List<String> starting = new LinkedList<String>();
		starting.add(startingPosition);
		visited.put(startingPosition, starting);
	}

	/**
	 * findMoves return an array with possible moves for this piece on the board
	 * package protected so it is testable but not intended for mass
	 * consumption.
	 * 
	 * @param board
	 * @return
	 */
	List<String> findMoves(ChessBoard board) {
		List<String> moves = new LinkedList<String>();

		// TODO: this could be easily cleaned up by
		char[] pos = currentPosition.toCharArray();
		int file = pos[0] - 'a' + 1;
		int rank = pos[1] - '1' + 1;

		int newfile, newrank;
		newfile = file + 2;
		newrank = rank + 1;
		considerAdding(board, moves, newfile, newrank);

		newfile = file + 1;
		newrank = rank + 2;
		considerAdding(board, moves, newfile, newrank);

		newfile = file - 2;
		newrank = rank + 1;
		considerAdding(board, moves, newfile, newrank);

		newfile = file - 1;
		newrank = rank + 2;
		considerAdding(board, moves, newfile, newrank);

		newfile = file + 2;
		newrank = rank - 1;
		considerAdding(board, moves, newfile, newrank);

		newfile = file + 1;
		newrank = rank - 2;
		considerAdding(board, moves, newfile, newrank);

		newfile = file - 2;
		newrank = rank - 1;
		considerAdding(board, moves, newfile, newrank);

		newfile = file - 1;
		newrank = rank - 2;
		considerAdding(board, moves, newfile, newrank);

		return moves;
	}

	private void considerAdding(ChessBoard board, List<String> moves,
			int newfile, int newrank) {
		if (board.contains(newfile, newrank)) {
			String space = "";
			char f = (char) (newfile + 'a' - 1);
			space += f;
			char r = (char) (newrank + '1' - 1);
			space += r;
			moves.add(space);
		}
	}

	public List<String> locateDistinct(ChessBoard board) {
		List<String> moves = findMoves(board);
		List<String> distinct = new LinkedList<String>();
		for (String move : moves) {
			if (!visited.containsKey(move)) {
				distinct.add(move);
				List<String> newPath = new LinkedList<String>();
				newPath.addAll(visited.get(currentPosition));
				newPath.add(move);
				visited.put(move, newPath);
			}
		}
		return distinct;
	}

	public void moveTo(String newPosition) {
		currentPosition = newPosition;
	}

	public List<String> visited() {
		return visited.get(currentPosition);
	}

	public String getCurrentPosition() {
		return currentPosition;
	}

}