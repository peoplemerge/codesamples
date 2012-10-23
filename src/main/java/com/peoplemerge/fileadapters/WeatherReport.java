package com.peoplemerge.fileadapters;


public class WeatherReport implements HasVariance {

	int month, max, min;

	public WeatherReport(int month, int max, int min) {
		this.month = month;
		this.max = max;
		this.min = min;
	}

	public int getDay() {
		return month;
	}

	public int getMax() {
		return max;
	}

	public int getMin() {
		return min;
	}

	@Override
	public int getVariance() {
		return max-min;
	}

	public Object getKey() {
		return getDay();
	}


}