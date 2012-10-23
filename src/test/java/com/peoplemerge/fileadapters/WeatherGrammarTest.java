package com.peoplemerge.fileadapters;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class WeatherGrammarTest {

	String withWx = "\n"

			+ "<pre>\n"

			+ "  Dy MxT   MnT   AvT   HDDay  AvDP 1HrP TPcpn WxType PDir AvSp Dir MxS SkyC MxR MnR AvSLP\n"

			+ "  1  88    59    74          53.8       0.00 F       280  9.6 270  17  1.6  93 23 1004.5\n"

			+ "</pre>\n";
//  1  88    59    74          53.8       0.00 F       280  9.6 270  17  1.6  93 23 1004.5
//  2  79    63    71          46.5       0.00         330  8.7 340  23  3.3  70 28 1004.5
//     9             86          32*         59       6       61.5    0.00          240     7.6     220     12      6.0     78      46      1018.6

	@Test
	public void testWithWx() throws Exception {

		VarianceAwareList all = VarianceAwareList.weatherFactory(withWx);
		assertEquals(1, all.size());
		assertTrue(all.get(0) instanceof WeatherReport);
		WeatherReport single = (WeatherReport) all.get(0);
		assertEquals(1, single.getDay());
		assertEquals(88, single.getMax());
		assertEquals(59, single.getMin());
		assertEquals(29, single.getVariance());
	}
	
	String withoutWx = "\n"

		+ "<pre>\n"

		+ "  Dy MxT   MnT   AvT   HDDay  AvDP 1HrP TPcpn WxType PDir AvSp Dir MxS SkyC MxR MnR AvSLP\n"

		+ "  2  79    63    71          46.5       0.00         330  8.7 340  23  3.3  70 28 1004.5\n"

		+ "</pre>\n";

	@Test
	public void testWithoutWx() throws Exception {

		VarianceAwareList all = VarianceAwareList.weatherFactory(withoutWx);
		assertEquals(1, all.size());
		WeatherReport single = (WeatherReport) all.get(0);
		assertEquals(2, single.getDay());
	}

	
	String withAsterix = "\n"

		+ "<pre>\n"

		+ "  Dy MxT   MnT   AvT   HDDay  AvDP 1HrP TPcpn WxType PDir AvSp Dir MxS SkyC MxR MnR AvSLP\n"

		+ "  9  86    32*   59       6  61.5       0.00         240  7.6 220  12  6.0  78 46 1018.6\n"

		+ "</pre>\n";

	//    

	@Test
	public void testWithAsterix() throws Exception {

		VarianceAwareList all = VarianceAwareList.weatherFactory(withAsterix);
		assertEquals(1, all.size());
		WeatherReport single = (WeatherReport) all.get(0);
		assertEquals(9, single.getDay());
		assertEquals(32, single.getMin());
	}

}
