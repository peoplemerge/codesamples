package com.peoplemerge.fileadapters;

import org.junit.Assert;
import org.junit.Test;

public class ScoresTest {

	

	@Test
	public void testBestScore() throws Exception{

		VarianceAwareList scores = new FileInterpreter().parseSoccer();
		Object diff = scores.whoHasLowestVariance();
		Assert.assertEquals("Aston_Villa", diff);

	}
}
