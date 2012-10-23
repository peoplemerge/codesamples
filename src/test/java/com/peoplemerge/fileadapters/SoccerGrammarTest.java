package com.peoplemerge.fileadapters;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class SoccerGrammarTest {

	String contents = "\n"

	+ "<pre>\n"

	+ "       Team            P     W    L   D    F      A     Pts\n"

	+ "    1. Arsenal         38    26   9   3    79  -  36    87\n"

	+ "</pre>\n";

	@Test
	public void testGrammar() throws Exception{

		VarianceAwareList scores = VarianceAwareList.soccerFactory(contents);
		assertEquals(1,scores.size());
		assertTrue(scores.get(0) instanceof TeamScore);
		TeamScore score = (TeamScore) scores.get(0);
		assertEquals(38, score.getPlays());
		assertEquals(26, score.getWins());
		assertEquals(9, score.getLosses());
		assertEquals(3, score.getDraws());
		assertEquals(79, score.getScoreFor());
		assertEquals(36, score.getScoreAgainst());
		assertEquals(87, score.getPoints());
	}

}
