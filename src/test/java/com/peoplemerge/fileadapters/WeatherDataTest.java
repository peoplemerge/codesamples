package com.peoplemerge.fileadapters;

import org.junit.Assert;
import org.junit.Test;

public class WeatherDataTest {
	/*
	 * In the attached file (w_data.dat), you'll find daily weather data.
	 * Download this text file, then write a program to output the day number
	 * (column one) with the smallest temperature spread (the maximum
	 * temperature is the second column, the minimum the third column).
	 */
	
	@Test
	public void testDayWithLowestVariance() throws Exception{

		VarianceAwareList weatherData = new FileInterpreter().parseWeather();
		Object diff = weatherData.whoHasLowestVariance();
		Assert.assertEquals(14, diff);

	}
}
