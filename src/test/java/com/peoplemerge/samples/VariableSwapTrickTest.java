package com.peoplemerge.samples;

import junit.framework.Assert;

import org.junit.Test;

public class VariableSwapTrickTest {

	@Test
	public void swapWithoutIntermediateVar() {
		Integer i = 389456;
		Integer k = 13495;
		
		i = i ^ k;
		k = i ^ k;
		i = i ^ k;
		
		Assert.assertEquals(new Integer(13495), i);
		Assert.assertEquals(new Integer(389456), k);
	}


}
